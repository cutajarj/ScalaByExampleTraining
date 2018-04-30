package com.cutajarjames.scalabyexample.lesson2

import org.scalatest.{FlatSpec, Matchers}

class DecimalToBinarySpec extends FlatSpec with Matchers {

  it should "output one for one decimal" in {
    (new DecimalToBinary).convertToBinary(1) shouldEqual "1"
  }

  it should "output 10110111 for 183" in {
    (new DecimalToBinary).convertToBinary(183) shouldEqual "10110111"
  }

  it should "output 1010011111000 for 5368" in {
    (new DecimalToBinary).convertToBinary(5368) shouldEqual "1010011111000"
  }
}
