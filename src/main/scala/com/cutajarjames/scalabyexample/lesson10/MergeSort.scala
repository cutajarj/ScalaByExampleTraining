package com.cutajarjames.scalabyexample.lesson10

class MergeSort {
  def merge(left:List[Int], right:List[Int]): List[Int] = {
    val output = (0 until left.length + right.length).foldLeft(List[Int](), left, right) { (triple, _) =>
      val (merged, leftRemaining, rightRemaining) = triple
      (leftRemaining, rightRemaining) match {
        case (Nil, r :: rTail) => (r :: merged, Nil, rTail)
        case (l :: lTail, Nil) => (l :: merged, lTail, Nil)
        case (l :: lTail, r :: rTail) if l < r => (l :: merged, lTail, rightRemaining)
        case (l :: lTail, r :: rTail) => (r :: merged, leftRemaining, rTail)
      }
    }
    output._1.reverse
  }

  def sort(input: Vector[Int]): List[Int] = {
    if (input.isEmpty) List()
    else if(input.length == 1) List(input.head)
    else {
      val (left, right) = input.splitAt(input.length / 2)
      val sortedLeft = sort(left)
      val sortedRight = sort(right)
      merge(sortedLeft, sortedRight)
    }
  }
}
