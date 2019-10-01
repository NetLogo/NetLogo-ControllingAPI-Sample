version := "0.0.1"
isSnapshot := true

fork in run := true
cancelable in Global := true

scalaVersion := "2.12.8"
scalaSource in Test := baseDirectory.value / "src" / "test"
scalaSource in Compile := baseDirectory.value / "src" / "main"
scalacOptions ++= Seq( "-unchecked", "-deprecation", "-feature", "-Xfatal-warnings" )

libraryDependencies ++= Seq(
  "org.nlogo" % "netlogo" % "6.1.0",
  "org.jhotdraw" % "jhotdraw" % "6.0b1" % "provided,optional" from "http://ccl-artifacts.s3-website-us-east-1.amazonaws.com/jhotdraw-6.0b1.jar"
)
