package lectures.myself

object GFG6
{

  // Main method
  def main(args: Array[String])
  {
    val list: List[AnyVal] = List(
      333, true, false
    )

    list.foreach(element => println(element))
  }
}