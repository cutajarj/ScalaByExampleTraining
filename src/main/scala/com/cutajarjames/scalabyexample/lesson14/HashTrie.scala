package com.cutajarjames.scalabyexample.lesson14

class HashTrie[K,V](hashVector: Vector[List[(K,V)]]) extends HashTable[K,V] {

  private val m = hashVector.size

  private def hash(key: K) = {
    val h = key.## % m
    if (h < 0) h + m else h
  }

  override def search(key: K): Option[V] = {
    val list = hashVector(hash(key))
    list.find(t => t._1 == key).map(t => t._2)
    //list.collectFirst{case (k,v) if k == key => v}
  }

  override def insert(key: K, value: V): HashTable[K, V] = {
    val i = hash(key)
    val list = hashVector(i)
    val newList = (key, value) +: list.filter{case (k,v) => k != key}
    new HashTrie(hashVector.updated(i, newList))
  }

  override def delete(key: K): HashTable[K, V] = {
    val i = hash(key)
    val list = hashVector(i)
    val newList = list.filter{case (k,v) => k != key}
    new HashTrie(hashVector.updated(i, newList))
  }
}


object HashTrie {
  def apply[K,V](intialSize:Int): HashTrie[K,V] = {
    val hashVector = Vector.fill(intialSize)(Nil)
    new HashTrie[K,V](hashVector)
  }
}