val text = "Sally sells seashells on the seashore"
text.map(c => if (c == 's') 'c' else c)
text.count(_ == 's')

val myList = List(2, 2, 3, 5, 6, 7)
myList.forall(_ < 5)

val optNumber = myList.find(_ > 5).getOrElse(-1)

val optIndex = myList.indices
  .find(i => myList(i) > 5)
  .getOrElse(-1)

text.indices.find(i => text(i) == 's').getOrElse(-1)

def substringSearch(text:String, pattern:String): Int = {
  text.indices.find { i =>
    i + pattern.length <= text.length &&
    pattern.indices.forall(j => text(j + i) == pattern(j))
  }.getOrElse(-1)
}

substringSearch(text,"seashore")
