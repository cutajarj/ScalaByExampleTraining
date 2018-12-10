val length = Array(10, 5, 2, 1)

val samplePer = 29

length.map(len => samplePer / len)

length.foldLeft(samplePer) { (p, len) =>
  val multiple = p / len
  println(s"We can buy $multiple reels of length $len")
  p-multiple * len
}

case class Choice(p:Int, reels:List[Int])
val c = Choice(29, Nil)
val c2 = c.copy(p = 10)


//16, {}
//6, {10}
//1, {10, 5}
//0, {10, 5, 1}

length.foldLeft(Choice(29,Nil)){ (choice, len) =>
  val multiple = choice.p / len
  val reelsToBuy = List.fill(multiple)(len)
  Choice(choice.p - multiple * len,
    choice.reels ::: reelsToBuy)
}.reels