package com.cutajarjames.scalabyexample.lesson5

import org.scalatest.{FlatSpec, Matchers}

class GreedyFarmerSpec extends FlatSpec with Matchers {
  it should "output an empty list if perim is zero" in {
    val greedyFarmer = new GreedyFarmer()
    greedyFarmer.whichReels(0) shouldEqual Nil
  }

  it should "output the correct list if perim is 19" in {
    val greedyFarmer = new GreedyFarmer()
    greedyFarmer.whichReels(19) shouldEqual List(10, 5, 2, 2)
  }

  it should "output the correct list if perim is 203" in {
    val greedyFarmer = new GreedyFarmer()
    greedyFarmer.whichReels(203) shouldEqual List(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 2, 1)
  }

  it should "output the correct list if perim is large" in {
    val greedyFarmer = new GreedyFarmer()
    greedyFarmer.whichReels(100000).sum shouldEqual 100000
  }

}
