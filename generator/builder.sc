/** Code generator
  *
  * These classes turn component definitions into Scala code.
  */

import $file.definition

import definition._

class SBTProjectBuilder(
    col: WebComponentCollection,
    organization: String,
    version: String,
) {
    def name = s"laminar-components-${col.packageName}"

    def buildNpmDep(p: NpmPackage) = s"""npmDependencies in Compile += "${p.name}" -> "${p.version}""""

    def getNpmDeps(comp: WebComponent): Seq[NpmPackage] = Seq(comp.npmPackage) ++ comp.subComponents.flatMap(getNpmDeps)

    def buildNPMDeps = col.components.flatMap(getNpmDeps).distinct.map(buildNpmDep).mkString("\n\n")

    def build = s"""
enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "$name"

version := "$version"

normalizedName := "$name"

organization := "$organization"

scalaVersion := "2.13.3"

crossScalaVersions := Seq("2.12.10", "2.13.3")

libraryDependencies += "com.raquo" %%% "laminar" % "0.10.2"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig in (Compile, fastOptJS) ~= { _.withSourceMap(false) }

useYarn := true

$buildNPMDeps
    """
}

def buildStylesObject(cssProperties: Seq[CSSProperty], docLink: String) = {

  def decapitalize(string: String) = string.substring(0, 1).toLowerCase() + string.substring(1)

  def buildStyleReactiveField(p: CSSProperty) = s"""
        /** ${p.description}
          *
          * $docLink
          */
        val ${decapitalize(p.name.replaceAllLiterally("--", "").split("-").tail.map(_.capitalize).mkString)} = new ReactiveStyle(new Style("${p.name}", "${p.name}"))
  """

  s"""
    object styles {
        import com.raquo.domtypes.generic.keys.Style

        ${cssProperties.map(buildStyleReactiveField).mkString("\n")}
    }
  """
}

class CollectionBuilder(col: WebComponentCollection, organization: String) {
  val docLink = s"""@see <a href="${col.link}">Component Collection Documentation</a>"""

  def build = s"""
        /** ${col.packageName}
          *
          * $docLink
          */
        package ${organization}.${col.packageName} {

            import com.raquo.domtypes.generic.codecs._
            import com.raquo.laminar.api.L._
            import com.raquo.laminar.builders.HtmlTag
            import com.raquo.laminar.keys.{ReactiveHtmlAttr, ReactiveProp, ReactiveStyle}
            import com.raquo.laminar.nodes.ReactiveHtmlElement

            import org.scalajs.dom

            import scala.scalajs.js
            import scala.scalajs.js.annotation.JSImport

            ${buildStylesObject(col.globalCssProperties, docLink)}

            ${col.components.map(c => new Builder(c).build).mkString("\n")}
        }
    """
}

class Builder(comp: WebComponent) {
  val objectName = comp.tag.split("-").tail.map(_.capitalize).mkString
  val docLink    = s"""@see <a href="${comp.link}">Component Documentation</a>"""

  def scalaType(wctype: WebComponentFieldType) =
    wctype match {
      case WebComponentFieldType.Any     => "Any"
      case WebComponentFieldType.Boolean => "Boolean"
      case WebComponentFieldType.Number  => "Double"
      case WebComponentFieldType.String  => "String"
    }

  def propCodec(wctype: WebComponentFieldType) =
    wctype match {
      case WebComponentFieldType.Any     => ???
      case WebComponentFieldType.Boolean => "BooleanAsIsCodec"
      case WebComponentFieldType.Number  => "DoubleAsIsCodec"
      case WebComponentFieldType.String  => "StringAsIsCodec"
    }

  def buildMethodSignature(m: Method) = s"""
        /** ${m.description}
          *
          * $docLink
          */
        def ${m.name}(): Unit
    """

  def buildPropertyGetter(p: Property) = s"""
        /** ${p.description}
          *
          * $docLink
          */
        def `${p.name}`: ${scalaType(p.tpe)}
  """

  def buildPropertyReactiveField(p: Property) = s"""
        /** ${p.description}
          *
          * $docLink
          */
        val `${p.name}` = new ReactiveProp("${p.name}", ${propCodec(p.tpe)})
  """

  def buildEventReactiveField(e: Event) = s"""
        /** ${e.description}
          *
          * $docLink
          */
        val on${e.name.split(':').last.split("-").map(_.capitalize).mkString} = new EventProp[dom.Event]("${e.name}")
  """

  def buildRawElement = s"""
    @js.native
    trait RawElement extends js.Object {
        ${comp.properties.map(buildPropertyGetter).mkString("\n")}

        ${comp.methods.map(buildMethodSignature).mkString("\n")}
    }
  """

  def buildImport = s"""
    @js.native
    @JSImport("${comp.jsImport}", JSImport.Default)
    object RawImport extends js.Object {}
    RawImport // needed because objects are lazy
  """

  def buildTypes = s"""
    type Ref = dom.html.Element with RawElement
    type El = ReactiveHtmlElement[Ref]
    type ModFunction = $objectName.type => Mod[El]
  """

  def buildTag = s"""
    private val tag = new HtmlTag[Ref]("${comp.tag}", void = false)
  """

  def buildReactiveProperties =
    comp.properties
      .filterNot(_.isReadOnly)
      .filterNot(_.tpe == WebComponentFieldType.Any)
      .map(buildPropertyReactiveField)
      .mkString("\n")

  def buildEvents = comp.events.map(buildEventReactiveField).mkString("\n")

  def buildStyles = buildStylesObject(comp.cssProperties, docLink)

  def buildDefaultSlot =
    comp.slots.default match {
      case Some(DefaultSlot(description)) => s"""
        /** $description
          *
          * $docLink
          */
        def default(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := ""))
      """
      case None                           => ""
    }

  def buildNamedSlot(s: NamedSlot) = s"""
    /** ${s.description}
      *
      * $docLink
      */
    def ${s.name}(els: HtmlElement*): Seq[HtmlElement] = els.map(_.amend(slot := "${s.name}"))
  """

  def buildSlots = s"""
    object slots {
        $buildDefaultSlot

        ${comp.slots.named.map(buildNamedSlot).mkString("\n")}
    }
  """

  def build: String = s"""
    /** ${comp.tag}
      *
      * ${comp.description}
      *
      * {@literal ${comp.npmPackage.name}@${comp.npmPackage.version}}
      *
      * $docLink
      */
    object $objectName {
        $buildRawElement

        $buildImport

        $buildTypes

        $buildTag

        $buildSlots

        $buildReactiveProperties

        $buildEvents

        $buildStyles

        def apply(mods: ModFunction*): El = {
            tag(mods.map(_($objectName)): _*)
        }


        ${comp.subComponents.map(c => new Builder(c).build).mkString("\n")}
    }
  """
}
