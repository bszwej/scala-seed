name := "scala-seed"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaVersion = "2.4.11"
  val scalaTestVersion = "3.0.0"
  val scalaCheckVersion = "1.13.2"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,

    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % "test",
    "org.scalacheck" %% "scalacheck" % scalaCheckVersion % "test",
    "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
  )
}

crossPaths := false

scalacOptions ++= Seq(
  "-target:jvm-1.8",
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Xfuture",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused",
  "-Ywarn-unused-import"
)
