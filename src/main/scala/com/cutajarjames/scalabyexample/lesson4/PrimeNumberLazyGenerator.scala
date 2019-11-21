package com.cutajarjames.scalabyexample.lesson4

import com.cutajarjames.scalabyexample.lesson3.SequenceGenerator

class PrimeNumberLazyGenerator extends SequenceGenerator {
  val allPrimes: LazyList[Int] = 2 #:: LazyList.from(3)
    .filter { c =>
      val primesUpToSqrtC = allPrimes.takeWhile(p => p <= math.sqrt(c))
      !primesUpToSqrtC.exists(p => c % p == 0)
    }

  override def generate(total: Int): List[Int] = {
    allPrimes.takeWhile(n => n < total).toList
  }

}
