name := """scala-fnv"""

version := "1.0.0"

scalaVersion := "2.11.7"

lazy val scala213 = "2.13.0-RC1"
lazy val scala212 = "2.12.8"
lazy val scala211 = "2.11.12"
lazy val supportedScalaVersions = List(scala213, scala212, scala211)

lazy val root = (project in file("."))
  .settings(
    crossScalaVersions := supportedScalaVersions,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % "test"
  )

