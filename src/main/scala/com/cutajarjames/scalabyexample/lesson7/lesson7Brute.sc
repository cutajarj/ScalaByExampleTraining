val tempDiff = Array(-13, -4, -4, 5, -4, 6, -9, 6, -3, 5, -2, 7, 5, 5, -8, 3, -2, -3, 3)

tempDiff.slice(0, tempDiff.length + 1)

for (i <- 0 until tempDiff.length) {
  for (j <- (i + 1) to tempDiff.length) {
    println(tempDiff.slice(i, j).mkString(", "))
  }
}
val absDiff = for (x <- tempDiff) yield math.abs(x)
val myList1 = List(1, 2, 3)
val myList2 = List(4, 5, 6)
val allStrs = for (i <- myList1; j <- myList2) yield s"$i - $j"
def maxSubArray(input: Array[Int]): Int = {
  val allSums = for (i <- 0 until input.length;
                     j <- (i + 1) to input.length)
    yield input.slice(i, j).sum
  allSums.max
}
maxSubArray(tempDiff)
