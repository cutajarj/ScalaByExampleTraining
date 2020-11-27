package com.cutajarjames.scalabyexample.lesson11

import org.scalatest.{FlatSpec, Matchers}

class NaiveSubstringSearchSpec extends FlatSpec with Matchers {
  "The NaiveSubstringSearch " should "output -1 if not found" in {
    val text = "Sally sells seashells on the seashore"
    val pattern = "rockets"

    (new NaiveSubstringSearch).substringSearch(text, pattern) shouldEqual -1
  }

  "The NaiveSubstringSearch " should "output -1 if not found" in {
    val text = "Sally sells seashells on the seashoro"
    val pattern = "rockets"

    (new NaiveSubstringSearch).substringSearch(text, pattern) shouldEqual -1
  }

  "The NaiveSubstringSearch " should "output a correct index if found at the end" in {
    val text = "Sally sells seashells on the seashore"
    val pattern = "seashore"

    (new NaiveSubstringSearch).substringSearch(text, pattern) shouldEqual 29
  }

  "The NaiveSubstringSearch " should "output a correct index if found at the start" in {
    val text = "Sally sells seashells on the seashore"
    val pattern = "Sally"

    (new NaiveSubstringSearch).substringSearch(text, pattern) shouldEqual 0
  }

  "The NaiveSubstringSearch " should "output a correct index if found in the middle" in {
    val text = "Sally sells seashells on the seashore"
    val pattern = "seashells"

    (new NaiveSubstringSearch).substringSearch(text, pattern) shouldEqual 12
  }

}
