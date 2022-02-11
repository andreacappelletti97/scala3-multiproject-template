val scala3Version = "3.1.1"

lazy val root = project
 .in(file("."))
 .settings(
 name := "orchestrator",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
 libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 ) aggregate(projectA, projectB) dependsOn(projectA, projectB)

lazy val projectA = project
 .in(file("projectA"))
 .settings(
 name := "projectA",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
 libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 )

lazy val projectB = project
 .in(file("projectB"))
 .settings(
 name := "projectB",
 scalaVersion := "2.13.3",
 //Scala 2 dependencies
 libraryDependencies ++= Seq()
 )

val jarName = "orchestrator.jar"
assembly/assemblyJarName := jarName