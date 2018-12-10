package com.cutajarjames.scalabyexample.lesson3

class ArithmeticGenerator(start:Int, diff: Int) extends SequenceGenerator {
  override def generate(total: Int): List[Int] =
    (0 until total).map(n => start + n * diff).toList
}
