package com.cutajarjames.scalabyexample.lesson3

import org.scalatest.{FlatSpec, Matchers}

class SequenceGeneratorSpec extends FlatSpec with Matchers {

  it should "separate the sequence with commas" in {
    val sequenceGenerator = new SequenceGenerator {
      override def generate(total: Int): List[Int] = List(1,2,3,4,5)
    }
    sequenceGenerator.generateStr(5) shouldEqual "1,2,3,4,5"
  }

}
