lazy val app = project in file(".") enablePlugins (Cinnamon)

cinnamon in run := true

name := "cinnamon-mdc-filter-test"

version := "1.0"

scalaVersion := "2.12.8"

val AkkaHttpVersion = "10.1.9"
val AkkaVersion = "2.5.24"

libraryDependencies ++= Seq(
  Cinnamon.library.cinnamonAkkaHttp,
  Cinnamon.library.cinnamonSlf4jMdc,
  "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe" % "config" % "1.3.3"
)

cinnamonLogLevel := "INFO"
