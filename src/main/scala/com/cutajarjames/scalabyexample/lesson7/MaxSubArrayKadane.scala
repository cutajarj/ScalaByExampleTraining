package com.cutajarjames.scalabyexample.lesson7

class MaxSubArrayKadane {
  def maxSubArray(input: List[Int]): Int = {
    input.tail.foldLeft((input.head, input.head)) { (maxTupple, x) =>
      val (maxGlobal, maxLocal) = maxTupple
      val newMaxLocal = math.max(maxLocal + x, x)
      val newMaxGlobal = math.max(maxGlobal, newMaxLocal)
      (newMaxGlobal, newMaxLocal)
    }._1
  }
}
