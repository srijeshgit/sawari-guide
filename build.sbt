name := "sawari-guide"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers ++= Seq(
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/")

libraryDependencies ++= Seq(
                           jdbc,
                           anorm,
                          "mysql" % "mysql-connector-java" % "5.1.27"
                        )