val list = List(7, 3, 1, 4, 1, 6)

val (a, b) = list.span(n => n != 1)

val opStack = List("/", "*", "(", "(", "*")

opStack.span(op => "(".contains(op))

val strNumbs = List("2", "3", "4")

strNumbs.map(nStr => nStr match {
  case "2" => "TWO"
  case "3" => "THREE"
  case _ => "SOMETHING ELSE"
})

def toPostFix(infix: List[String]): List[String] = {
  val pfix = List[String]()
  val ostk = List[String]()

  val (exp,stk) = infix.foldLeft((pfix, ostk)) { (tuple, token) =>
    val (postFix, opStack) = tuple
    token match {
      case "(" => (postFix, "(" +: opStack)
      case ")" =>
        val (beforeBracket, rest) = opStack.span(op => op != "(")
        (postFix ::: beforeBracket, rest.tail)
      case "-" =>
        val (higher, lower) = opStack.span(op => "/*+-".contains(op))
        (postFix ::: higher, "-" +: lower)
      case "+" =>
        val (higher, lower) = opStack.span(op => "/*+".contains(op))
        (postFix ::: higher, "+" +: lower)
      case "*" =>
        val (higher, lower) = opStack.span(op => "/*".contains(op))
        (postFix ::: higher, "*" +: lower)
      case "/" =>
        val (higher, lower) = opStack.span(op => "/".contains(op))
        (postFix ::: higher, "/" +: lower)
      case _ => (postFix :+ token, opStack)
    }
  }

  exp ::: stk
}

toPostFix("2 + 3".split(" ").toList)

toPostFix("5 * 2 - 3".split(" ").toList)