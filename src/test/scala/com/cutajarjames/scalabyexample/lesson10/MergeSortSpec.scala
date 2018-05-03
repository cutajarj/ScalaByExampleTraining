package com.cutajarjames.scalabyexample.lesson10

import org.scalatest.{FlatSpec, Matchers}

class MergeSortSpec extends FlatSpec with Matchers {
  "The BubbleSort " should "output an empty List if the input is empty" in {
    val numbers = Vector[Int]()
    (new MergeSort).sort(numbers) shouldEqual Vector[Int]()
  }

  it should "output the same List if the Vector is alread sorted" in {
    val numbers = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9)
    (new MergeSort).sort(numbers) shouldEqual Vector(1, 2, 3, 4, 5, 6, 7, 8, 9)
  }

  it should "handle a vector with the same number inside" in {
    val numbers = Vector(2, 2, 2, 2, 2)
    (new MergeSort).sort(numbers) shouldEqual Vector(2, 2, 2, 2, 2)
  }

  it should "sort numbers correctly for an even cout" in {
    val numbers = Vector(5, 2, 6, 3, 9, 1)
    (new MergeSort).sort(numbers) shouldEqual Vector(1, 2, 3, 5, 6, 9)
  }

  it should "sort numbers correctly for an odd cout" in {
    val numbers = Vector(5, 2, 6, 3, 9, 1, 7)
    (new MergeSort).sort(numbers) shouldEqual Vector(1, 2, 3, 5, 6, 7, 9)
  }

}
