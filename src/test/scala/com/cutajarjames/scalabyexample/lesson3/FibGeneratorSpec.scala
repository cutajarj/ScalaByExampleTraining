package com.cutajarjames.scalabyexample.lesson3

import org.scalatest.{FlatSpec, Matchers}

class FibGeneratorSpec extends FlatSpec with Matchers {

  it should "generate an empty list if 0 is specified" in {
    //val sequenceGenerator: SequenceGenerator = new FibonacciGenerator()
    val sequenceGenerator: SequenceGenerator = null
    sequenceGenerator.generateStr(0) shouldEqual ""
  }

  it should "generate the correct sequence with a total of 12" in {
    //val sequenceGenerator: SequenceGenerator = new FibonacciGenerator()
    val sequenceGenerator: SequenceGenerator = null
    sequenceGenerator.generateStr(12) shouldEqual "1,1,2,3,5,8,13,21,34,55,89,144"
  }
}
