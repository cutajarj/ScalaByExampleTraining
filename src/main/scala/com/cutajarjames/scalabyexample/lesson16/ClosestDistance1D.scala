package com.cutajarjames.scalabyexample.lesson16

import com.cutajarjames.scalabyexample.lesson15.Point

object ClosestDistance1D {

  def closestDistance(ptsByX: List[Point]): Double = {
    -1.0
  }

  def closestDistanceBrute(pts: List[Point]): Double = {
    val distances = for ((pti,i) <- pts.zipWithIndex.dropRight(1); ptj <- pts.drop(i + 1)) yield pti.distanceTo(ptj)
    distances.min
  }

}
