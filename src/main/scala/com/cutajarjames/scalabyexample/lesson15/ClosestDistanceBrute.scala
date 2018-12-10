package com.cutajarjames.scalabyexample.lesson15

import scala.util.Random

object ClosestDistanceBrute {
  val rand = Random

  def generatePoints(i: Int): List[Point] = (0 until i)
    .map(_ => Point(rand.nextInt(Int.MaxValue), rand.nextInt(Int.MaxValue))).toSet.toList

  def closestDistanceBrute(pts: List[Point]): Double = {
    val distances = for ((pti,i) <- pts.zipWithIndex.dropRight(1);
                         ptj <- pts.drop(i + 1)) yield pti.distanceTo(ptj)
    distances.min
  }

  def main(args: Array[String]): Unit = {
    val allPoints = generatePoints(3000)

    val before = System.currentTimeMillis()
    val distanceBruteForce = closestDistanceBrute(allPoints)
    val after = System.currentTimeMillis()

    println(s"Closest Point using Brute Force is $distanceBruteForce, found in ${after - before} ms")
  }
}
