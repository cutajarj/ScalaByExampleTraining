val sampleList = List(1, 2, 3)

val sampleList2 = 1 :: 2 :: 3 :: Nil

val stream1 = 1 #:: 2 #:: 3 #:: LazyList.empty

stream1(1)
stream1(2)

val streamRand = LazyList.continually(math.random())

streamRand.take(5).toList

val list1 = List("A", "B", "C")
val list2 = List("a", "b", "c")

list1.head
list1.tail

list1.zip(list2.tail).map { case (u, l) => u + l }

val listFib = List(1, 1, 2, 3, 5)
listFib.zip(listFib.tail).map(t => t._1 + t._2)

val fibs:LazyList[Int] = 1 #:: 1 #:: fibs.zip(fibs.tail)
    .map(t => t._1 + t._2)

fibs.take(10).toList