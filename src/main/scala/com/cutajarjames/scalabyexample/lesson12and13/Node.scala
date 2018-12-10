package com.cutajarjames.scalabyexample.lesson12and13

case class Node[K, V](key: K, value: V,
                      left: Option[Node[K, V]] = None,
                      right: Option[Node[K, V]] = None)
