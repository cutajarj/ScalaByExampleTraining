package com.cutajarjames.scalabyexample.lesson16

import com.cutajarjames.scalabyexample.lesson15.Point

object ClosestDistance1D {

  def closestDistance(ptsByX: List[Point]): Double = {
    closestDistanceSorted(ptsByX.sortBy(_.x))
  }

  def closestDistanceSorted(ptsByX: List[Point]): Double = {
    if (ptsByX.size <= 3) closestDistanceBrute(ptsByX)
    else {
      val (left, right) = ptsByX.splitAt(ptsByX.length / 2)
      val l = right.head.x
      val delta = math.min(closestDistance(left), closestDistance(right))
      val ptsInBoundary = ptsByX.filter(p => p.x >= l - delta && p.x <= l + delta)
      val deltaInBoundary =
        if (ptsInBoundary.size > 1) closestDistanceBrute(ptsInBoundary)
        else Int.MaxValue
      Math.min(deltaInBoundary, delta)
    }
  }

  def closestDistanceBrute(pts: List[Point]): Double = {
    val distances = for ((pti,i) <- pts.zipWithIndex.dropRight(1); ptj <- pts.drop(i + 1)) yield pti.distanceTo(ptj)
    distances.min(Ordering.Double.TotalOrdering)
  }

}
