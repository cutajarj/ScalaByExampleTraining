package com.cutajarjames.scalabyexample.lesson1

import org.scalatest.{FlatSpec, Matchers}

class QuickIntersectionSpec extends FlatSpec with Matchers {
  "The QuickIntersection " should "output an empty list if one of the list is empty" in {
    (new QuickIntersection).intersection(Nil, List(1, 2, 3)) shouldEqual Nil
  }

  it should "output an empty list if both of the lists is empty" in {
    (new QuickIntersection).intersection(Nil, Nil) shouldEqual Nil
  }


  it should "output an empty list if there is no itersection" in {
    (new QuickIntersection).intersection(List(5, 2, 7, 9), List(1, 8, 6, 4)) shouldEqual Nil
  }

  it should "output the correct intersection" in {
    (new QuickIntersection).intersection(List(5, 2, 7, 9), List(1, 9, 6, 2)).toSet shouldEqual Set(2, 9)
  }

  it should "output the correct full intersection" in {
    (new QuickIntersection).intersection(List(5, 2, 7, 9), List(5, 2, 7, 9)).toSet shouldEqual Set(5, 2, 7, 9)
  }
}

