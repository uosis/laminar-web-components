
enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "laminar-web-components-material"

version := "0.1.0"

normalizedName := "laminar-web-components-material"

organization := "com.github.uosis"

githubOwner := "uosis"

githubRepository := "laminar-web-components"

scalaVersion := "2.13.3"

crossScalaVersions := Seq("2.12.10", "2.13.3")

libraryDependencies += "com.raquo" %%% "laminar" % "0.10.2"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig in (Compile, fastOptJS) ~= { _.withSourceMap(false) }

useYarn := true

npmDependencies in Compile += "@material/mwc-button" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-checkbox" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-circular-progress" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-circular-progress-four-color" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-dialog" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-drawer" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-fab" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-formfield" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-icon-button-toggle" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-icon-button" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-icon" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-linear-progress" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-radio" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-slider" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-snackbar" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-switch" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-tab-bar" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-tab" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-list" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-menu" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-textfield" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-textarea" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-select" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-top-app-bar-fixed" -> "0.18.0"

npmDependencies in Compile += "@material/mwc-top-app-bar" -> "0.18.0"
    