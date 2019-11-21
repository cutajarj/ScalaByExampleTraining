package com.cutajarjames.scalabyexample.lesson5


class GreedyFoldingFarmer {
  val lengths = Array(10, 5, 2, 1)

  case class Choice(p:Int, reels:List[Int])

  def whichReels(p: Int): List[Int] = lengths.foldLeft(Choice(p,Nil)){ (choice, len) =>
    val multiple = choice.p / len
    val reelsToBuy = List.fill(multiple)(len)
    Choice(choice.p - multiple * len,
      choice.reels ::: reelsToBuy)
  }.reels

}


