package lectures.myself

// Scala program of Method
// scope for Scala variable

// class created with Method
// variables s1 and s2.
class GFG2
{
  def mult(s1: Int, s2: Int)
  {
//    not possible bec method arguments are by default val
//    s1 = 10
//    s2 = 15
    var result = s1 * s2
    println("Area is: " + result);
  }
}

class Person(var name:String,var age:Int )

object Area
{
  // Main method
  def main(args:Array[String])
  {
//    val su = new GFG2()
//    val x = 5
//    val y = 2
//    su.mult(x,y)

    val person = new Person("Palani", 24)
    person.name = "palaniappan"
    person.age = 25
    println(person.toString)

  }
}

// def, val and var
// https://stackoverflow.com/questions/4437373/use-of-def-val-and-var-in-scala

// ranges
// https://www.geeksforgeeks.org/scala-ranges/

// different for loops
// https://www.geeksforgeeks.org/for-loop-in-scala/

// break
// https://www.geeksforgeeks.org/break-statement-in-scala/

// yield
// https://www.geeksforgeeks.org/scala-yield-keyword/

// type inference needed for recursive methods
// https://www.geeksforgeeks.org/scala-type-inference/