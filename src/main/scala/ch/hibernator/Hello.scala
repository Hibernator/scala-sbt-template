package ch.hibernator

import scala.io.Source
import scala.util.Using

object Hello:
  def main(args: Array[String]): Unit =
    Using(Source.fromResource("hello.txt")): source =>
      println(source.mkString)
