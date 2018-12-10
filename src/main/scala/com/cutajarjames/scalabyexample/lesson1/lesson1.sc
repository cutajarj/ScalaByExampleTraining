import scala.collection.mutable.ListBuffer

val x = List(3, 5, 2, 4)

val y = List(2, 4, 8)


val intersection = ListBuffer[Int]()

for (i <- x; j <- y)
    if (i == j) intersection += i

intersection

val cities = List("Paris", "London", "Lisbon")

val cities2 = cities.updated(2, "Porto")

cities.map(c => if (c == "Lisbon") "Rome" else c)

"Porto" +: cities

cities :+ "Porto"

cities.filter(c => c != "Lisbon")

for (i <- x; j <- y; if i == j)
  yield i

x.filter(i => y.contains(i))

x.filter(y.contains(_))

x.filter(y.contains)

x.intersect(y)
