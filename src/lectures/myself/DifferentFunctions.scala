package lectures.myself

// partial function - https://www.geeksforgeeks.org/currying-functions-in-scala-with-examples/
// => is known as a transformer
// when an anonymous function is assigned to a variable then we can invoke that variable like a function call

// https://www.geeksforgeeks.org/method-overriding-in-scala/
object DifferentFunctions {

  def add2(a: Int) (b: Int) = a + b

  def add(a: Int) = (b: Int) => a + b

  var myfc1 = (str1:String, str2:String) => str1 + str2

  val myfc2 = (_:String) + (_:String)

  var myfun1 = () => {"Welcome to GeeksforGeeks...!!"}

// A function which contain anonymous
  // function as a parameter
  def myfunction(fun:(String, String)=> String) =
  {
    fun("Dog", "Cat")
  }

  // Explicit type declaration of anonymous
  // function in another function
  val f1 = myfunction((str1: String,
                       str2: String) => str1 + str2)

  // Shorthand declaration using wildcard
  val f2 = myfunction(_ + _)

  def main(args: Array[String])
  {
    println(add2(29)(5));

    val sum=add2(29)_;
    println(sum(5));

    println(add(20)(19));

    println(myfc1("Palaniappan","RM"))
    myfc2("Palaniappan","RM")

    println(myfun1())

    println(f1)
    println(f2)

  }

}
