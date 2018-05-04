package com.cutajarjames.scalabyexample

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "Hello and welcome to Scala by Example Training!"
}
