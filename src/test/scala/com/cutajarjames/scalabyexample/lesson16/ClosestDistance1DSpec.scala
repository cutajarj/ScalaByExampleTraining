package com.cutajarjames.scalabyexample.lesson16

import com.cutajarjames.scalabyexample.lesson15.Point
import org.scalactic.TolerantNumerics
import org.scalatest.{FlatSpec, Matchers}

class ClosestDistance1DSpec extends FlatSpec with Matchers {
  implicit val doubleEquality = TolerantNumerics.tolerantDoubleEquality(0.001)

  "The ClosestDistanceBruteSpec" should "output the correct value" in {
    val points = List(Point(10,0), Point(11,0), Point(20,0), Point(17,0), Point(15,0), Point(13,0))
    ClosestDistance1D.closestDistance(points) shouldEqual 1.0
  }

  it should "output the correct value with a larger list" in {
    val points = List(Point(11,0), Point(100,0), Point(200,0), Point(70,0), Point(73,0), Point(103,0),
      Point(201,0), Point(87,0), Point(76,0), Point(32,0), Point(10,0), Point(143,0),
      Point(131,0), Point(187,0), Point(81,0), Point(67,0), Point(2,0), Point(16,0)
    )
    ClosestDistance1D.closestDistance(points) shouldEqual 3.0
  }

}
