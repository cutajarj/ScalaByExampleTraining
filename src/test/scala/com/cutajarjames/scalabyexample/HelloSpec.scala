package com.cutajarjames.scalabyexample

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting should contain('H')
  }
}
