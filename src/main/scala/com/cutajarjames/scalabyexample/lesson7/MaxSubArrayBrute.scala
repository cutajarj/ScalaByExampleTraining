package com.cutajarjames.scalabyexample.lesson7

class MaxSubArrayBrute {
  def maxSubArray(input: Array[Int]): Int = {
    val allSums = for (i <- 0 until input.length;
                       j <- (i + 1) to input.length)
      yield input.slice(i, j).sum
    allSums.max
  }
}
