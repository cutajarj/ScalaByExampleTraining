

def intersection(x: List[Int], y:List[Int]): Unit = {
  intersectionSorted(x.sorted, y.sorted)
}

def intersectionSorted(x: List[Int], y:List[Int],
                       intersection: List[Int] = Nil): List[Int] =  (x, y) match {
  case (Nil, _) | (_, Nil) => intersection
  case (hx::tx, hy::ty) if hx == hy => intersectionSorted(tx, ty, hx +: intersection)
  case (hx::tx, hy::ty) if hx > hy => intersectionSorted(x, ty, intersection)
  case _ => intersectionSorted(x.tail, y, intersection)
}
