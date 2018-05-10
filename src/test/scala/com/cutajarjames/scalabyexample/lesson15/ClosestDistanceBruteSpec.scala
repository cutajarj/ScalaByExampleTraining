package com.cutajarjames.scalabyexample.lesson15

import org.scalactic.TolerantNumerics
import org.scalatest.{FlatSpec, Matchers}

class ClosestDistanceBruteSpec extends FlatSpec with Matchers {
  implicit val doubleEquality = TolerantNumerics.tolerantDoubleEquality(0.001)

  "The ClosestDistanceBruteSpec" should "output the correct value" in {
    val points = List(Point(10,10), Point(11,11), Point(20,10), Point(10,20), Point(15,13), Point(13,17))
    ClosestDistanceBrute.closestDistanceBrute(points) shouldEqual 1.4142
  }

  it should "output the correct value with a larger list" in {
    val points = List(Point(11,11), Point(100,100), Point(200,10), Point(70,35), Point(73,43), Point(103,27),
      Point(201,31), Point(87,92), Point(76,45), Point(32,38), Point(10,79), Point(143,22),
      Point(131,131), Point(187,20), Point(81,45), Point(67,19), Point(2,45), Point(16,122)
    )
    ClosestDistanceBrute.closestDistanceBrute(points) shouldEqual 3.6055
  }


}
