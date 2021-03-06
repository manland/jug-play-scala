import sbt._
import Keys._
import play.Project._


object ApplicationBuild extends Build {

  val appName = "jug-play-scala"
  val appVersion = "1.0"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
    "com.typesafe.slick" %% "slick" % "1.0.1",
    "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
    "securesocial" %% "securesocial" % "2.1.2", // exclude("org.scala-stm", "scala-stm_2.10.0"),
    //    "net.orcades" %% "play-crude-macros" % "0.0.1-SNAPSHOT",
    jdbc)

  val main = play.Project(appName, appVersion, appDependencies).settings( // Add your own project settings here
  )

}
