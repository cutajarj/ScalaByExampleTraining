package com.cutajarjames.scalabyexample.lesson4

import com.cutajarjames.scalabyexample.lesson3.SequenceGenerator

import scala.collection.mutable.ListBuffer

class PrimeNumberGenerator extends SequenceGenerator {

  override def generate(total: Int): List[Int] = {
    val primes = ListBuffer[Int]()
    val candidates = Array.fill(total + 1)(true)
    for (i <- 2 to total) {
      if (candidates(i)) {
        primes += i
        for (j <- (i * 2) to total by i)
          candidates(j) = false
      }
    }
    primes.toList
  }
}
