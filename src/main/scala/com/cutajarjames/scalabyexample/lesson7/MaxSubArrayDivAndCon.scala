package com.cutajarjames.scalabyexample.lesson7

class MaxSubArrayDivAndCon {
  def maxAcross(left:Vector[Int], right:Vector[Int]): Int = {
    val leftSub = for (i <- 1 to left.length) yield left.takeRight(i).sum
    val rightSub = for (i <- 1 to right.length) yield right.take(i).sum
    leftSub.max + rightSub.max
  }


  def maxSubArray(input:Vector[Int]):Int = input match {
    case Vector(x) => x
    case _ =>
      val (leftV, rightV) = input.splitAt(input.length / 2)
      val maxLeft = maxSubArray(leftV)
      val maxRight = maxSubArray(rightV)
      val maxCross = maxAcross(leftV, rightV)
      List(maxCross, maxLeft, maxRight).max
  }
}
