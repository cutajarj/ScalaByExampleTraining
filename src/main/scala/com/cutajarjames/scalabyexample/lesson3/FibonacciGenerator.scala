package com.cutajarjames.scalabyexample.lesson3

class FibonacciGenerator extends SequenceGenerator {
  val fibs:LazyList[Int] = 1 #:: 1 #:: fibs.zip(fibs.tail).map(t => t._1 + t._2)

  override def generate(total: Int): List[Int] = fibs.take(total).toList
}
