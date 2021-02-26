
enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "laminar-components-showcase"

version := "0.1-SNAPSHOT"

normalizedName := "laminar-components-showcase"

organization := "com.github.uosis"

scalaVersion := "2.13.3"

crossScalaVersions := Seq("2.12.10", "2.13.3")

libraryDependencies += "com.raquo" %%% "laminar" % "0.10.2"

resolvers += Resolver.githubPackages("uosis")

libraryDependencies += "com.github.uosis" %%% "laminar-web-components-material" % "0.1.0"

scalaJSUseMainModuleInitializer := true

scalaJSLinkerConfig in (Compile, fastOptJS) ~= { _.withSourceMap(false) }

useYarn := true
