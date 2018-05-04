package com.cutajarjames.scalabyexample.lesson14

trait HashTable[K, V] {
  def search(key: K): Option[V]

  def insert(key: K, value: V): HashTable[K, V]

  def delete(key: K): HashTable[K, V]
}
