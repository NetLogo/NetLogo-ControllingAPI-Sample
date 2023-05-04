version := "0.0.2"
isSnapshot := true

// run / fork := true
Global / cancelable := true

scalaVersion := "2.12.17"
// Test / scalaSource := baseDirectory.value / "src" / "test"
Compile / scalaSource := baseDirectory.value / "src" / "main"
scalacOptions ++= Seq( "-unchecked", "-deprecation", "-feature", "-Xfatal-warnings" )

resolvers += "netlogo" at "https://dl.cloudsmith.io/public/netlogo/netlogo/maven/"
libraryDependencies ++= Seq(
  "org.nlogo" % "netlogo" % "6.3.0"
, "org.jogamp.jogl" % "jogl-all" % "2.4.0" from "https://jogamp.org/deployment/archive/rc/v2.4.0/jar/jogl-all.jar"
, "org.jogamp.gluegen" % "gluegen-rt" % "2.4.0" from "https://jogamp.org/deployment/archive/rc/v2.4.0/jar/gluegen-rt.jar"
, "org.jhotdraw" % "jhotdraw" % "6.0b1" % "provided,optional" from s"https://s3.amazonaws.com/ccl-artifacts/jhotdraw-6.0b1.jar"
)
