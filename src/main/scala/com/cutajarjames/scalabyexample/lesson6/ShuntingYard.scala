package com.cutajarjames.scalabyexample.lesson6

class ShuntingYard {
  def evaluateInfix(infix:String): Double =  evaluatePostfix(toPostfix(infix.split(" ").toList))

  def toPostfix(infix: List[String]): List[String] = {
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

  def evaluatePostfix(postFix:List[String]): Double = {
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

}
