package lectures.myself

// Scala Program to illustrate the keywords

// Here class keyword is used to create a new class
// def keyword is used to create Function
// var keyword is used to create a variable
class GFG
{
  var name = "Priyanka"
  var age:Int = 20
  var branch = "Computer Science"
  var array = Array(1)
  def show() : Unit =
  {
    println("Hello! my name is " + name + "and my age is"+age);
    println("My branch name is " + branch);
    for(x <- array){
      print(x)
    }
  }
}

// object keyword is used to define
// an object new keyword is used to
// create an object of the given class
object Main
{
  def main(args: Array[String])
  {
    var ob = new GFG();
    ob.show();
  }
}

/*
Enumeration - https://www.geeksforgeeks.org/enumeration-in-scala/
Pattern matching - https://www.geeksforgeeks.org/scala-pattern-matching/ - match { case "" => case _ => }
reading from console - scala.io.StdIn.readLine()
Multi line literals - """ """
 */