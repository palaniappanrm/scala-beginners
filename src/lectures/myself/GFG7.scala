package lectures.myself

class GeeksforGeeks
class Author extends GeeksforGeeks
class Geeks extends GeeksforGeeks

class ComputerSciencePortal
{
  // Declaration of Lower bound
  def display [T >: Geeks](d : T)
  {
    println(d)
  }
}

// Object created
object GFG7
{
  // Driver code
  def main(args: Array[String])
  {

    val geeksforgeeks = new GeeksforGeeks
    val author = new Author
    val geeks = new Geeks

    val computerscienceportal = new ComputerSciencePortal

    computerscienceportal.display(geeksforgeeks)
    computerscienceportal.display(geeks)
    computerscienceportal.display(author)
  }
}
