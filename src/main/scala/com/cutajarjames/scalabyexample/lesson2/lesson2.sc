def convertToBinary(decimal: Int): String = {
  var stack=List[Int]()
  var x = decimal
  while (x > 0) {
    stack = (x % 2) +: stack
    x /= 2
  }
  stack.mkString
}

convertToBinary(183)

val rands = Iterator.continually(Math.random())

rands.take(5).toList

val plusOne = Iterator.iterate(6)(n => n + 1)

plusOne.take(5).map(n => n * 2).toList

val divByTwo = Iterator.iterate(183){n =>
  println("divByTwo")
  n / 2
}
divByTwo
  .takeWhile(n => n > 0)
  .map{n =>
    println("map")
    n % 2
  }
  .toList
  .reverse
  .mkString

