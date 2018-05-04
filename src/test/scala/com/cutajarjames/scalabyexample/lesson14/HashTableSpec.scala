package com.cutajarjames.scalabyexample.lesson14

import org.scalatest.{FlatSpec, Matchers}

class HashTableSpec extends FlatSpec with Matchers {
  "A HashTable" should "output None if not found" in {
    //val hashTable: HashTable[Int, String] = HashTrie(5)
    val hashTable:HashTable[Int,String] = null
    hashTable.search(10) shouldEqual None
  }

  it should "output the correct value" in {
    //val hashTable: HashTable[Int, String] = HashTrie(5)
    val hashTable:HashTable[Int,String] = null
    hashTable.insert(4, "Isabel")
      .insert(8, "Michelle")
      .insert(10, "Ruth")
      .search(10) should contain("Ruth")
  }

  it should "output correct return for all searches" in {
    //val hashTable: HashTable[Int, String] = HashTrie(5)
    val hashTable:HashTable[Int,String] = null
    val hashTableAfterInsert = hashTable.insert(4, "Isabel")
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

    hashTableAfterInsert.search(4) should contain("Isabel")
    hashTableAfterInsert.search(8) should contain("Michelle")
    hashTableAfterInsert.search(15) should contain("Judith")
    hashTableAfterInsert.search(10) should contain("Ruth")
    hashTableAfterInsert.search(7) should contain("Sam")
    hashTableAfterInsert.search(9) should contain("John")
    hashTableAfterInsert.search(6) should contain("Matti")
    hashTableAfterInsert.search(12) should contain("Jane")
    hashTableAfterInsert.search(20) should contain("Sarah")
    hashTableAfterInsert.search(14) should contain("Peter")
    hashTableAfterInsert.search(17) should contain("Joe")
    hashTableAfterInsert.search(34) shouldEqual None
  }

  it should "output overwrite if already exits" in {
    //val hashTable: HashTable[Int, String] = HashTrie(5)
    val hashTable:HashTable[Int,String] = null
    hashTable.insert(4, "Isabel")
      .insert(8, "Michelle")
      .insert(10, "Ruth")
      .insert(10, "Judith")
      .search(10) should contain("Judith")
  }

  it should "output overwrite if already exits, linked list check" in {
    //val hashTable: HashTable[Int, String] = HashTrie(2)
    val hashTable:HashTable[Int,String] = null
    hashTable.insert(4, "Isabel")
      .insert(8, "Michelle")
      .insert(10, "Ruth")
      .insert(4, "Judith")
      .search(4) should contain("Judith")
  }

}
