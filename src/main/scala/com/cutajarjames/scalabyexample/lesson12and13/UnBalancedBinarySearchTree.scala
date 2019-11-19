package com.cutajarjames.scalabyexample.lesson12and13

import scala.collection.immutable.Queue

class UnBalancedBinarySearchTree[K, V](root: Node[K, V], ord: Ordering[K]) extends BinarySearchTree[K, V] {
  override def search(key: K): Option[V] = {
    search(key, root)
  }

  private def search(key: K, node: Node[K, V]): Option[V] = key match {
    case node.key => Some(node.value)
    case k if ord.lt(k, node.key) => node.left.flatMap(n => search(k, n))
    case k => node.right.flatMap(n => search(k, n))
  }

  override def insert(key: K, value: V): BinarySearchTree[K, V] = {
    new UnBalancedBinarySearchTree(insert(key, value, root), ord)
  }

  private def insert(key: K, value: V, node: Node[K,V]): Node[K,V] = key match {
    case node.key => node.copy(value = value)
    case k if ord.lt(k,node.key) =>
      val newLeft = node.left.map(n => insert(k,value, n)).orElse(Some(Node(key, value)))
      node.copy(left = newLeft)
    case k =>
      val newRight = node.right.map(n => insert(k,value, n)).orElse(Some(Node(key, value)))
      node.copy(right = newRight)
  }

  override def foreachDFS(f: (K, V) => Unit): Unit = foreachDFS(f, root)

  private def foreachDFS(f: (K, V) => Unit, node: Node[K,V]): Unit = {
    node.left.foreach(l => foreachDFS(f, l))
    f(node.key, node.value)
    node.right.foreach(r => foreachDFS(f, r))
  }

  override def foreachBFS(f: (K, V) => Unit): Unit = {
    val sq = LazyList.iterate(Queue(root)) {q =>
      val (node, tail) = q.dequeue
      tail ++ node.left ++ node.right
    }

    sq.takeWhile(q => q.nonEmpty).foreach(q => f(q.head.key, q.head.value))
  }
}

object UnBalancedBinarySearchTree {
  def apply[K, V](key: K, value: V)(implicit ord: Ordering[K]) = new
      UnBalancedBinarySearchTree(Node(key, value), ord)
}