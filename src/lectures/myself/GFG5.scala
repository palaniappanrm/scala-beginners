package lectures.myself

// https://www.geeksforgeeks.org/scala-case-class-and-case-object/

// By default Scala Compiler adds toString, equals methods, companion object with apply and unapply methods,
// for that reason you don’t need new keyword to construct object of a Case class

//The Scala compiler also appends a copy() method to case class that is utilized
// to create a duplicate of the same object with changing some parameters or without altering them

//The one of the topmost benefit of Case Class is that Scala Compiler affix a
// method with the name of the class having identical number of parameters
// as defined in the class definition, because of that you can create objects of the Case Class even in the absence of the keyword new

//Below two are important features of case object:
//It is serializable.
//It has a by default hashCode implementation

// case constructor parameters are val by default so can't alter them
// A Case Class is just like a regular class, which has a feature for modeling unchangeable data

case class C(val name: String) {

  def display[A](y:String = "palani", x:A="1")
  {
    println(y + " = " + x + " is of type " +
      x.getClass.getName);
  }
}

// Creating object
object GFG5
{
  // Main method
  def main (args: Array[String])
  {
    // Creating the instance of the ValueClass
    val c = new C("GeeksForGeeks")
    val d = new C("GeeksForGeeks")

    println(c == d)
    println(c.equals(d))
    println(c.eq(d))
    println(c.name)

//    c.display(x=1);
//    c match
//    {
//      // new C instantiated here
//      case C("GeeksForGeeks") => println("Matched with GeeksForGeeks")
//      case C(x) => println("Not matched with GeeksForGeeks")
//    }
  }
}

// Field overriding is possible in scala during inheritance
// only if fields are declared as val and by using override keyword
// abstract data members are those which have an unknown implementation

//In order to cast an Object (i.e, instance) from one type to another type, it is obligatory to use asInstanceOf method.
// This method is defined in Class Any which is the root of the scala class hierarchy (like Object class in Java).
// The asInstanceOf method belongs to concrete value members of Class Any which is utilized to cast the receiver Object

// equals -> https://www.geeksforgeeks.org/object-equality-in-scala/
// thread -> https://www.geeksforgeeks.org/scala-multithreading/ - very similar to java