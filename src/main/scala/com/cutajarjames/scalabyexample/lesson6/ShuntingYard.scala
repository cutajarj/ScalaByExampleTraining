package com.cutajarjames.scalabyexample.lesson6

class ShuntingYard {
  def evaluateInfix(infix:String): Double =  evaluatePostfix(toPostfix(infix.split(" ").toList))

  def toPostfix(infix: List[String]): List[String] = null

  def evaluatePostfix(postFix:List[String]): Double = 0.0

}
