import $file.material
import $file.builder

val organization = "dev.laminar"
val version = "0.1-SNAPSHOT"

val outputProjectPath = os.pwd / "material"

val buildSbt = new builder.SBTProjectBuilder(material.componentCollection, organization, version).build
val code = new builder.CollectionBuilder(material.componentCollection, organization).build

os.write.over(outputProjectPath / os.RelPath("src/main/scala/material.scala"), code)
os.write.over(outputProjectPath / "build.sbt", buildSbt)
