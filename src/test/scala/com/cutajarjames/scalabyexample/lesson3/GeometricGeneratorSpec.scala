package com.cutajarjames.scalabyexample.lesson3

import org.scalatest.{FlatSpec, Matchers}

class GeometricGeneratorSpec extends FlatSpec with Matchers {

  it should "generate an empty list if 0 is specified" in {
    //val sequenceGenerator: SequenceGenerator = new GeometricGenerator(5,3)
    val sequenceGenerator: SequenceGenerator = null
    sequenceGenerator.generateStr(0) shouldEqual ""
  }

  it should "generate the correct sequence with a=5 and r=3" in {
    //val sequenceGenerator: SequenceGenerator = new GeometricGenerator(5,3)
    val sequenceGenerator: SequenceGenerator = null
    sequenceGenerator.generateStr(5) shouldEqual "5,15,45,135,405"
  }

  it should "generate the correct sequence with a=2 and a=4" in {
    //val sequenceGenerator: SequenceGenerator = new GeometricGenerator(2,4)
    val sequenceGenerator: SequenceGenerator = null
    sequenceGenerator.generateStr(6) shouldEqual "2,8,32,128,512,2048"
  }

}
