package com.cutajarjames.scalabyexample.lesson11

class NaiveSubstringSearch {
  def substringSearch(text:String, pattern:String):Int = {
    text.indices.find { i =>
      i + pattern.length <= text.length &&
        pattern.indices.forall(j => text(j + i) == pattern(j))
    }.getOrElse(-1)
  }
}
