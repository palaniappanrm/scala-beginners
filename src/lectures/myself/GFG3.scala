package lectures.myself
//  inner/outer class/obj
//  https://www.geeksforgeeks.org/inner-class-in-scala/

//  Multiple inheritance is possible only through traits

//  Operator precedence - https://www.geeksforgeeks.org/operators-precedence-in-scala/

//  An abstract class can also contain only non- abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited

//  https://www.geeksforgeeks.org/generic-classes-in-scala/ - generic class and 1 generic method
//  access modifiers - https://www.geeksforgeeks.org/access-modifiers-in-scala/

// Creating primary construtor with default values
class GFG3 (var Aname: String = "Ankita",
          val Cname: String = "Constructors")
{
  def display()
  {
    println("Author name: " + Aname);
    println("Chapter name: " + Cname);

  }
}

object Main1
{
  def main(args: Array[String])
  {
    // Creating object of GFG class
    var obj = new GFG3();
    obj.display();
  }
}

