package com.cutajarjames.scalabyexample.lesson5

import scala.annotation.tailrec


class GreedyFarmer {
  val lengths = Array(10, 5, 2, 1)

  def whichReels(p: Int): List[Int] = {
    whichReels(p, Nil)
  }

  private def whichReels(p: Int, reals:List[Int]): List[Int] = {
    if (p == 0) reals
    else {
      var i = 0
      while (lengths(i) > p) i += 1
      whichReels(p - lengths(i), reals :+ lengths(i))
    }
  }

}

object GreedyFarmer {
  def main(args: Array[String]): Unit = {
    println((new GreedyFarmer).whichReels(200000))
  }
}
