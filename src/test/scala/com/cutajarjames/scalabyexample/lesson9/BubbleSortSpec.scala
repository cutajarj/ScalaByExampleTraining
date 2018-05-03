package com.cutajarjames.scalabyexample.lesson9

import org.scalatest.{FlatSpec, Matchers}

class BubbleSortSpec extends FlatSpec with Matchers {
  "The BubbleSort " should "output an empty Array if the Array is empty" in {
    val numbers = Array[Int]()
    (new BubbleSort).sort(numbers)
    numbers shouldEqual Array[Int]()
  }

  it should "output the same Array if the Array is alread sorted" in {
    val numbers = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    (new BubbleSort).sort(numbers)
    numbers shouldEqual Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
  }

  it should "handle an Array with the same number inside" in {
    val numbers = Array(2, 2, 2, 2, 2)
    (new BubbleSort).sort(numbers)
    numbers shouldEqual Array(2, 2, 2, 2, 2)
  }

  it should "sort numbers correctly for an even cout" in {
    val numbers = Array(5, 2, 6, 3, 9, 1)
    (new BubbleSort).sort(numbers)
    numbers shouldEqual Array(1, 2, 3, 5, 6, 9)
  }

  it should "sort numbers correctly for an odd cout" in {
    val numbers = Array(5, 2, 6, 3, 9, 1, 7)
    (new BubbleSort).sort(numbers)
    numbers shouldEqual Array(1, 2, 3, 5, 6, 7, 9)
  }
}
