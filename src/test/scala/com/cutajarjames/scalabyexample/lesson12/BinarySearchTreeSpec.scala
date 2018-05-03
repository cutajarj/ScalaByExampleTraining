package com.cutajarjames.scalabyexample.lesson12

import org.scalatest.{FlatSpec, Matchers}

class BinarySearchTreeSpec extends FlatSpec with Matchers {
  "A BinarySearchTree" should "output None if not found" in {
    //val binarySearchTree:BinarySearchTree[Int,String] = BinarySearchTree(5,"James")
    val binarySearchTree:BinarySearchTree[Int,String] = null
    binarySearchTree.search(10) shouldEqual None
  }

  "A BinarySearchTree" should "output Some if not found" in {
    //val binarySearchTree:BinarySearchTree[Int,String] = BinarySearchTree(5,"James")
    val binarySearchTree:BinarySearchTree[Int,String] = null
    binarySearchTree.insert(4,"Isabel")
    binarySearchTree.insert(8,"Michelle")
    binarySearchTree.insert(10,"Ruth")
    binarySearchTree.search(10) should contain("Ruth")
  }

  "A BinarySearchTree" should "output correct return for all searches" in {
    //val binarySearchTree:BinarySearchTree[Int,String] = BinarySearchTree(5,"James")
    val binarySearchTree:BinarySearchTree[Int,String] = null
    binarySearchTree.insert(4,"Isabel")
    binarySearchTree.insert(8,"Michelle")
    binarySearchTree.insert(10,"Ruth")
    binarySearchTree.insert(15,"Judith")
    binarySearchTree.insert(7,"Sam")
    binarySearchTree.insert(9,"John")
    binarySearchTree.insert(6,"Matti")
    binarySearchTree.insert(12,"Jane")
    binarySearchTree.insert(20,"Sarah")
    binarySearchTree.insert(14,"Peter")
    binarySearchTree.insert(17,"Joe")

    binarySearchTree.search(4) should contain("Isabel")
    binarySearchTree.search(8) should contain("Michelle")
    binarySearchTree.search(10) should contain("Ruth")
    binarySearchTree.search(15) should contain("Judith")
    binarySearchTree.search(7) should contain("Sam")
    binarySearchTree.search(9) should contain("John")
    binarySearchTree.search(6) should contain("Matti")
    binarySearchTree.search(12) should contain("Jane")
    binarySearchTree.search(20) should contain("Sarah")
    binarySearchTree.search(14) should contain("Peter")
    binarySearchTree.search(17) should contain("Joe")
    binarySearchTree.search(34) shouldEqual None
  }


  "A BinarySearchTree" should "output overwrite if already exits" in {
    //val binarySearchTree:BinarySearchTree[Int,String] = BinarySearchTree(5,"James")
    val binarySearchTree:BinarySearchTree[Int,String] = null
    binarySearchTree.insert(4,"Isabel")
    binarySearchTree.insert(8,"Michelle")
    binarySearchTree.insert(10,"Ruth")
    binarySearchTree.insert(10,"Judith")
    binarySearchTree.search(10) should contain("Judith")
  }
}
