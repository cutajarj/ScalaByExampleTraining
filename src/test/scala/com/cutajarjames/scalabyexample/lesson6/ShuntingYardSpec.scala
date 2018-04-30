package com.cutajarjames.scalabyexample.lesson6

import org.scalatest.{FlatSpec, Matchers}

class ShuntingYardSpec extends FlatSpec with Matchers {

  "PostFix conversion" should "output Nil when the expression 1 + 2" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.toPostfix("1 + 2".split(" ").toList) shouldEqual List("1", "2", "+")
  }

  it should "output Nil when the expression 1 + 6 / 2" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.toPostfix("1 + 6 / 2".split(" ").toList) shouldEqual List("1", "6", "2", "/", "+")
  }

  it should "output Nil when the expression 1 + 6 * 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.toPostfix("1 + 6 * 4".split(" ").toList) shouldEqual List("1", "6", "4", "*", "+")
  }

  it should "output Nil when the expression 1 - 6 + 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.toPostfix("1 - 6 + 4".split(" ").toList) shouldEqual List("1", "6", "4", "+", "-")
  }

  it should "output Nil when the expression ( 1 + 6 ) * 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.toPostfix("( 1 + 6 ) * 4".split(" ").toList) shouldEqual List("1", "6", "+", "4", "*")
  }

  it should "output Nil when the expression ( 2 + 6 ) / 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.toPostfix("( 2 + 6 ) / 4".split(" ").toList) shouldEqual List("2", "6", "+", "4", "/")
  }

  it should "output Nil when the expression ( 2 + 6 ) / ( 3 + 1 )" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.toPostfix("( 2 + 6 ) / ( 3 + 1 )".split(" ").toList) shouldEqual List("2", "6", "+", "3", "1", "+", "/")
  }

  "Evaulation" should "output 3 when the expression 1 + 2" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.evaluateInfix("1 + 2").toInt shouldEqual 3
  }

  it should "output 4 when the expression 1 + 6 / 2" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.evaluateInfix("1 + 6 / 2").toInt shouldEqual 4
  }

  it should "output 25 when the expression 1 + 6 * 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.evaluateInfix("1 + 6 * 4").toInt shouldEqual 25
  }

  it should "output -9 when the expression 1 - 6 + 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.evaluateInfix("1 - 6 + 4").toInt shouldEqual -9
  }

  it should "output 28 when the expression ( 1 + 6 ) * 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.evaluateInfix("( 1 + 6 ) * 4").toInt shouldEqual 28
  }

  it should "output 2 when the expression ( 2 + 6 ) / 4" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.evaluateInfix("( 2 + 6 ) / 4").toInt shouldEqual 2
  }

  it should "output 2 when the expression ( 2 + 6 ) / ( 3 + 1 )" in {
    val shuntingYard = new ShuntingYard()
    shuntingYard.evaluateInfix("( 2 + 6 ) / ( 3 + 1 )").toInt shouldEqual 2
  }
}
