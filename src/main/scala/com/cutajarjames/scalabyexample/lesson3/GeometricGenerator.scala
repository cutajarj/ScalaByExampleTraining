package com.cutajarjames.scalabyexample.lesson3

class GeometricGenerator(start: Int, ratio: Int) extends SequenceGenerator {
  override def generate(total: Int): List[Int] = {
    (0 until total).map(n => (start * math.pow(ratio, n)).toInt).toList
  }
}
