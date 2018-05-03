package com.cutajarjames.scalabyexample.lesson11

import scala.io.Source

object SayingSearcher {

  def main(args: Array[String]): Unit = {
    val text = Source.fromFile("sayings.txt").getLines().mkString

    val pattern = "True communication depends upon our being straightforward with one another. " +
      "But the best way to communicate may be just to"

    val i = (new NaiveSubstringSearch).substringSearch(text, pattern)

    println(s"Index found at $i")

    println(text.substring(i, i + 183))
  }
}
