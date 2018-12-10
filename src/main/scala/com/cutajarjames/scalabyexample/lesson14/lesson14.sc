val str = "Hello"

str.##

(-3).hashCode % 5000

val m = 5003

def hash[K](key: K) = {
  val h = key.## % m
  if (h < 0) h + m else h
}
