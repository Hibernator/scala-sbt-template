package ch.hibernator

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SimpleTest extends AnyFunSuite, Matchers:
  test("example test"):
    true shouldEqual true
