package com.cutajarjames.scalabyexample.lesson12and13

import org.scalatest.{FlatSpec, Matchers}

class BinarySearchTreeSpec extends FlatSpec with Matchers {
  "A BinarySearchTree" should "output None if not found" in {
    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    //val binarySearchTree:BinarySearchTree[Int,String] = null
    binarySearchTree.search(10) shouldEqual None
  }

  it should "output the correct value" in {
    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    //val binarySearchTree:BinarySearchTree[Int,String] = null
    binarySearchTree.insert(4, "Isabel")
      .insert(8, "Michelle")
      .insert(10, "Ruth")
      .search(10) should contain("Ruth")
  }

  it should "output correct return for all searches" in {
    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    //val binarySearchTree:BinarySearchTree[Int,String] = null
    val binarySearchTreeAfterInsert = binarySearchTree.insert(4, "Isabel")
      .insert(8, "Michelle")
      .insert(10, "Ruth")
      .insert(15, "Judith")
      .insert(7, "Sam")
      .insert(9, "John")
      .insert(6, "Matti")
      .insert(12, "Jane")
      .insert(20, "Sarah")
      .insert(14, "Peter")
      .insert(17, "Joe")

    binarySearchTreeAfterInsert.search(4) should contain("Isabel")
    binarySearchTreeAfterInsert.search(8) should contain("Michelle")
    binarySearchTreeAfterInsert.search(15) should contain("Judith")
    binarySearchTreeAfterInsert.search(10) should contain("Ruth")
    binarySearchTreeAfterInsert.search(7) should contain("Sam")
    binarySearchTreeAfterInsert.search(9) should contain("John")
    binarySearchTreeAfterInsert.search(6) should contain("Matti")
    binarySearchTreeAfterInsert.search(12) should contain("Jane")
    binarySearchTreeAfterInsert.search(20) should contain("Sarah")
    binarySearchTreeAfterInsert.search(14) should contain("Peter")
    binarySearchTreeAfterInsert.search(17) should contain("Joe")
    binarySearchTreeAfterInsert.search(34) shouldEqual None
  }

  it should "output overwrite if already exits" in {
    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    //val binarySearchTree:BinarySearchTree[Int,String] = null
    binarySearchTree.insert(4, "Isabel")
      .insert(8, "Michelle")
      .insert(10, "Ruth")
      .insert(10, "Judith")
      .search(10) should contain("Judith")
  }
}
