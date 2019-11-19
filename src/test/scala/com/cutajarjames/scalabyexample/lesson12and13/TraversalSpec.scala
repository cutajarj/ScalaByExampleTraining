package com.cutajarjames.scalabyexample.lesson12and13

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ListBuffer

class TraversalSpec extends FlatSpec with Matchers {
  "A DFS in a BinarySearchTree" should "with just one item should output just that item" in {
    val listBuffer: ListBuffer[(Int, String)] = ListBuffer[(Int, String)]()

    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    //val binarySearchTree: BinarySearchTree[Int, String] = null
    binarySearchTree.foreachDFS((key, value) => {
      listBuffer += ((key, value))
    })

    listBuffer shouldEqual ListBuffer((5, "James"))
  }

  it should "with loads of items should output in order" in {
    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    val listBuffer: ListBuffer[(Int, String)] = ListBuffer[(Int, String)]()

    //val binarySearchTree: BinarySearchTree[Int, String] = null
    binarySearchTree.insert(4, "Isabel")
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
      .foreachDFS((key, value) => {
        listBuffer += ((key, value))
      })
    listBuffer shouldEqual ListBuffer((4, "Isabel"), (5, "James"), (6, "Matti"), (7, "Sam"), (8, "Michelle"), (9, "John"), (10, "Ruth"),
      (12, "Jane"), (14, "Peter"), (15, "Judith"), (17, "Joe"), (20, "Sarah"))
  }

  "A BFS in a BinarySearchTree" should "with just one item should output just that item" in {
    val listBuffer: ListBuffer[(Int, String)] = ListBuffer[(Int, String)]()

    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    //val binarySearchTree: BinarySearchTree[Int, String] = null
    binarySearchTree.foreachBFS((key, value) => {
      listBuffer += ((key, value))
    })

    listBuffer shouldEqual ListBuffer((5, "James"))
  }

  it should "with loads of items should output in order" in {
    val binarySearchTree: BinarySearchTree[Int, String] = UnBalancedBinarySearchTree(5, "James")
    val listBuffer: ListBuffer[(Int, String)] = ListBuffer[(Int, String)]()

    //val binarySearchTree: BinarySearchTree[Int, String] = null
    binarySearchTree.insert(4, "Isabel")
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
      .foreachBFS((key, value) => {
        listBuffer += ((key, value))
      })
    listBuffer shouldEqual ListBuffer((5, "James"), (4, "Isabel"), (8, "Michelle"), (7, "Sam"), (10, "Ruth"), (6, "Matti"), (9, "John"),
      (15, "Judith"), (12, "Jane"), (20, "Sarah"), (14, "Peter"), (17, "Joe") )
  }

}
