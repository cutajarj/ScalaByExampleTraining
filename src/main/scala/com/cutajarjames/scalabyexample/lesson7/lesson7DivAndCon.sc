val tempDiff = Array(-13, -4, -4, 5, -4, 6, -9, 6, -3, 5, -2, 7, 5, 5, -8, 3, -2, -3, 3)

val left = Vector(1, 2, 3, 4)
val leftSub = for (i <- 1 to left.length) yield left.takeRight(i).sum

val right = Vector(4, 5, 6, 7)
val rightSub = for (i <- 1 to right.length) yield right.take(i).sum

leftSub.max
rightSub.max

def maxAcross(left:Vector[Int], right:Vector[Int]): Int = {
  val leftSub = for (i <- 1 to left.length) yield left.takeRight(i).sum
  val rightSub = for (i <- 1 to right.length) yield right.take(i).sum
  leftSub.max + rightSub.max
}


val input = Vector(1, 2, 3, 4)
val (leftV, rightV) = input.splitAt(input.length / 2)

def maxSubArray(input:Vector[Int]):Int = input match {
  case Vector(x) => x
  case _ =>
    val (leftV, rightV) = input.splitAt(input.length / 2)
    val maxLeft = maxSubArray(leftV)
    val maxRight = maxSubArray(rightV)
    val maxCross = maxAcross(leftV, rightV)
    List(maxCross, maxLeft, maxRight).max
}