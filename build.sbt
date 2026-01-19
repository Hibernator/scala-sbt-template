name := "scala-sbt-template"

version := "0.1"

scalaVersion := "3.7.4"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.13.0",
  "org.scalactic" %% "scalactic" % "3.2.19",
  "org.scalatest" %% "scalatest" % "3.2.19" % "test"
)

scalacOptions := Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-unchecked",
  "-explain",
  "-language:strictEquality"
)
