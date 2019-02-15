package app

import io.circe.generic.JsonCodec
import io.circe.syntax._

object Application extends App {

  @JsonCodec
  final case class Person(name: String, age: Int)

  println("Person: " + Person("Tony Montana", 35).asJson.noSpaces)
}
