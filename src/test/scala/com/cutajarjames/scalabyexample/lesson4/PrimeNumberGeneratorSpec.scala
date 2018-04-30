package com.cutajarjames.scalabyexample.lesson4

import com.cutajarjames.scalabyexample.lesson3.SequenceGenerator
import org.scalatest.{FlatSpec, Matchers}

class PrimeNumberGeneratorSpec extends FlatSpec with Matchers{

  it should "generate an empty list if 0 is specified" in {
    val sequenceGenerator: SequenceGenerator = new PrimeNumberGenerator
    sequenceGenerator.generateStr(0) shouldEqual ""
  }

  it should "generate the correct sequence with 14 total" in {
    val sequenceGenerator: SequenceGenerator = new PrimeNumberGenerator
    sequenceGenerator.generateStr(14) shouldEqual "2,3,5,7,11,13,17,19,23,29,31,37,41,43"
  }

  it should "generate the correct sequence for 1000" in {
    val sequenceGenerator: SequenceGenerator = new PrimeNumberGenerator
    sequenceGenerator.generate(1000).last shouldEqual 7919
  }

}
