val myList = List(1)

myList match {
  case 1 :: 2 :: 3 :: Nil => "ONE TWO THREE"
  case Nil => "Empty"
  case _ => "Something else"
}


myList match {
  case a :: b :: t => s"first item is $a second item is $b rest is $t"
  case a :: t => s"first item is $a rest is $t"
  case Nil => "Empty"
  case _ => "Something else"
}

def evaluate(postFix: List[String]): Double = {
  val nstk = postFix.foldLeft(List[Double]()) { (nStack, token) =>
    (nStack, token) match {
      case (a :: b :: t, "+") => (b + a) +: t
      case (a :: b :: t, "-") => (b - a) +: t
      case (a :: b :: t, "*") => (b * a) +: t
      case (a :: b :: t, "/") => (b / a) +: t
      case (_, n) => n.toDouble +: nStack
    }
  }
  nstk.head
}

evaluate(List("2", "3", "+"))