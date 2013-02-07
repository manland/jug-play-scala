package models

import scala.slick.session.Database
import scala.slick.driver.BasicDriver.Implicit._

import Database.threadLocalSession

object EntitiesTest extends App {
  Database.forURL("jdbc:postgresql:jug", "test", "test", driver = "org.postgresql.Driver") withSession {
    println("Speakers:")
    val v = Speakers.all
    println(v)
  }
}