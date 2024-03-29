name := "Mars Rovers"

organization := "com.thoughtworks.marsrovers"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.0.1" % "test"

initialCommands := "import com.thoughtworks.marsrovers.marsrovers._"