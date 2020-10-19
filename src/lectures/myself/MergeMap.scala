package lectures.myself

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
object MergeMap extends App {

  val map1 = Map("a" -> "A")
  val map2 = Map("a" -> "C")

  println(map1 ++ map2)

  val x ="x"
  println(x.toIntOption)

  val opt = Some("yes")
  opt.map(x => println(x))

  val y = Future {
    Thread.sleep(2000)
    42
  }

  y.map(println)

}
