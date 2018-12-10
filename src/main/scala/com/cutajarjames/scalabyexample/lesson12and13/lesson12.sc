import scala.collection.immutable.Queue

val q1 = Queue("Ruth", "Isabel", "Michelle")
val q2 = q1.enqueue("Sam")

val (next, q3) = q2.dequeue

next
q3
