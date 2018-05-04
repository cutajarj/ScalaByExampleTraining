package com.cutajarjames.scalabyexample.lesson12and13

trait BinarySearchTree[K, V] {
  def search(key: K): Option[V]

  def insert(key: K, value: V): BinarySearchTree[K, V]

  def foreachDFS(f:(K,V) => Unit): Unit

  def foreachBFS(f:(K,V) => Unit): Unit
}

