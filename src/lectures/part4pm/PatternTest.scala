package lectures.part4pm

object PatternTest extends App {

  val value1 = Some("3.2")

  val value2 = 3.3

  value1 match {
    case Some(x) if x.toFloat == value2.toFloat => println(x)
    case Some(x) if x.toFloat != value2.toFloat => println(x)
  }

}
