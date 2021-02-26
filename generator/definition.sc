/** Web Component Data Model
  *
  * These case classes describe web components - their tags, properties, etc.
  */


case class WebComponentCollection(
    packageName: String,
    components: Seq[WebComponent],
    link: String,
    globalCssProperties: Seq[CSSProperty],
)

case class WebComponent(
    tag: String,
    description: String,
    link: String,
    npmPackage: NpmPackage,
    jsImport: String,
    slots: Slots = Slots(None, Seq.empty),
    properties: Seq[Property] = Seq.empty,
    methods: Seq[Method] = Seq.empty,
    events: Seq[Event] = Seq.empty,
    cssProperties: Seq[CSSProperty] = Seq.empty,
    subComponents: Seq[WebComponent] = Seq.empty,
)

case class NpmPackage(name: String, version: String)

sealed trait WebComponentFieldType
object WebComponentFieldType {
    case object String extends WebComponentFieldType
    case object Boolean extends WebComponentFieldType
    case object Number extends WebComponentFieldType
    case object Any extends WebComponentFieldType
}

case class Property(
    name: String,
    tpe: WebComponentFieldType,
    description: String,
    isReadOnly: Boolean = false, // TODO: update definitions to reflect this
)

case class Method(
    name: String,
    description: String,
    // TODO: support parameters and return values
)

case class Event(
    name: String,
    description: String,
    // TODO: support details
)

case class Slots(default: Option[DefaultSlot], named: Seq[NamedSlot])

case class NamedSlot(
    name: String,
    description: String,
)

case class DefaultSlot(
    description: String,
)

case class CSSProperty(
    name: String,
    description: String,
    // TODO: support defaults and maybe types
)
