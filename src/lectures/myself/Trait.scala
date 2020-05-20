package lectures.myself

// order of trait Mixins - first extend class, then with traits

class MyClass {}

trait MyTrait {
  def print =
  println("Welcome to MyTrait");
  def call
}

object Trait {

  // Main method
  def main(args: Array[String]) {

    // Here MyTrait is added to the
    // object instance of MyClass
    val obj = new MyClass with MyTrait {
      override def call: Unit = ???
    };
    obj.print
  }
}

// https://www.geeksforgeeks.org/difference-between-traits-and-abstract-classes-in-scala/
