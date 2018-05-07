package com.cutajarjames.scalabyexample.lesson17

import com.cutajarjames.scalabyexample.lesson15.Point

import scala.util.Random

object ClosestDistance2D {
  val rand = Random

  def generatePoints(i: Int): List[Point] = (0 until i)
    .map(_ => Point(rand.nextInt(Int.MaxValue), rand.nextInt(Int.MaxValue))).toSet.toList

  def closestDistance(pts: List[Point]): Double = {
    -1.0
  }


  def main(args: Array[String]): Unit = {
    val allPoints = generatePoints(3000)

    val before = System.currentTimeMillis()
    val distance = closestDistance(allPoints)
    val after = System.currentTimeMillis()

    println(s"Closest Point using D&D is $distance, found in ${after - before} ms")
  }

}
