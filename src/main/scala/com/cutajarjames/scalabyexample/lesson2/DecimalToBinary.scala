package com.cutajarjames.scalabyexample.lesson2

class DecimalToBinary {
  def convertToBinary(decimal: Int): String = Iterator.iterate(decimal)(n => n / 2)
    .takeWhile(n => n > 0)
    .map(n => n % 2)
    .toList
    .reverse
    .mkString
}
