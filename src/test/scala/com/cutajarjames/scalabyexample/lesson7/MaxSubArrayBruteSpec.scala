package com.cutajarjames.scalabyexample.lesson7

import org.scalatest.{FlatSpec, Matchers}

class MaxSubArrayBruteSpec extends FlatSpec with Matchers {

  "MaxSubArray for sample 1" should "output 23" in {
    val maxSubArrayBrute = new MaxSubArrayBrute()
    maxSubArrayBrute
      .maxSubArray(Array(-13, -4, -4, 5, -4, 6, -9, 6, -3, 5, -2, 7, 5, 5, -8, 3, -2, -3, 3)) shouldEqual 23
  }

  "MaxSubArray for sample 2" should "output 12" in {
    val maxSubArrayBrute = new MaxSubArrayBrute()
    maxSubArrayBrute
      .maxSubArray(Array(2, -1, 3, 5, -4, 7)) shouldEqual 12
  }

  "MaxSubArray for sample 3" should "output 7" in {
    val maxSubArrayBrute = new MaxSubArrayBrute()
    maxSubArrayBrute
      .maxSubArray(Array(-2, -3, 4, -1, -2, 1, 5, -3)) shouldEqual 7
  }
}
