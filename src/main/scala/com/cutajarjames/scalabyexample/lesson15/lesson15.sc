import com.cutajarjames.scalabyexample.lesson15.Point

val list1 = List('A', 'B', 'C', 'D')

val list2 = List('a', 'b', 'c', 'd')

list1.zipWithIndex
.foreach{ case (c, i) =>
    println(s"$c, $i")
}

list1.drop(2)

list1.dropRight(2)

val p1 = Point(10,10)
val p2 = Point(15,10)
p1.distanceTo(p2)
