def bubbleSort1(numbers: Array[Int]): Unit = {
  for (k <- 1 until numbers.length)
    for (j <- 0 until numbers.length - k) {
      if (numbers(j) > numbers(j + 1)) {
        val temp = numbers(j)
        numbers(j) = numbers(j + 1)
        numbers(j + 1) = temp
      }
    }
}

def bubbleSort2(numbers: Array[Int]): Unit = {
  for (k <- 1 until numbers.length; j <- 0 until numbers.length - k) {
      if (numbers(j) > numbers(j + 1)) {
        val temp = numbers(j)
        numbers(j) = numbers(j + 1)
        numbers(j + 1) = temp
      }
    }
}

def bubbleSort3(numbers: Array[Int]): Unit = {
  for (k <- 1 until numbers.length;
       j <- 0 until numbers.length - k
       if numbers(j) > numbers(j + 1))
    (numbers(j), numbers(j + 1)) match {
      case (a, b) =>
        numbers(j) = b
        numbers(j + 1) = a
  }
}



val x = Array(3,5,6,83,5,2,6,8)
bubbleSort3(x)

x
