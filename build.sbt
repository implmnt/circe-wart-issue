name := "circe-wart-issue"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= List(
  "io.circe" %% "circe-core" % "0.11.0",
  "io.circe" %% "circe-parser" % "0.11.0",
  "io.circe" %% "circe-generic" % "0.11.0"
)

addCompilerPlugin(
  "org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full
)

wartremoverErrors ++= Warts.all