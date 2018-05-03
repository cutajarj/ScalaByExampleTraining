package com.cutajarjames.scalabyexample.lesson8

import org.scalatest.{FlatSpec, Matchers}

class FastIntersectionSpec extends FlatSpec with Matchers {
  "The FastIntersection " should "output an empty list if one of the list is empty" in {
    (new FastIntersection).intersection(Nil, List(1, 2, 3)) shouldEqual Nil
  }

  it should "output an empty list if both of the lists is empty" in {
    (new FastIntersection).intersection(Nil, Nil) shouldEqual Nil
  }


  it should "output an empty list if there is no itersection" in {
    (new FastIntersection).intersection(List(5, 2, 7, 9), List(1, 8, 6, 4)) shouldEqual Nil
  }

  it should "output the correct intersection" in {
    (new FastIntersection).intersection(List(5, 2, 7, 9), List(1, 9, 6, 2)).toSet shouldEqual Set(2, 9)
  }

  it should "output the correct full intersection" in {
    (new FastIntersection).intersection(List(5, 2, 7, 9), List(5, 2, 7, 9)).toSet shouldEqual Set(5, 2, 7, 9)
  }

}
