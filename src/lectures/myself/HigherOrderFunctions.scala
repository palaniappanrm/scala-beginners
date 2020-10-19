package lectures.myself

// A function is called Higher Order Function if it contains
// other functions as a parameter or returns a function as an output i.e,
// the functions that operate with another functions are known as Higher order Functions

// The Higher order functions are possible, as Scala programming language acts towards
// the functions as first-class values, which implies that analogous to some other values,
// functions can even be passed as a parameter or can be returned as an output
object HigherOrderFunctions {

  def main(args: Array[String])
  {

    println(apply(format, 32))
    println(multiplyValue)
    println("Multiplied List is: " + result)
    printIntiger(1,2)

    var Total = 0;

    // calling function
    ArticleCounts1
    {
      Total+=1; Total
    }

    ArticleCounts2
    {
      Total+=1; Total
    }

    // Calling function
    callByName(something)

    // Displays Multiplication
    println(r(9, 8))
    println(y(2))
    println(z(1)(2))

//    println("hi")
    // below is an issue bec both methods can be invoked by this
//    fun(No = 1,name = "palani");

  }

  // A higher order function
  def apply(x: Double => String, y: Double) = x(y)

  // Defining a function for
  // the format and using a
  // method toString()
  def format[R](z: R) = "{" + z.toString() + "}"

  val num = List(7, 8, 9)

  // Defining a method
  def multiplyValue = (y: Int) => y * 3

  // Creating a higher order function
  // that is assigned to the variable

  val result = num.map(y => multiplyValue(y))

// In normal scenario Unnamed Parameters uses Parameter Positions to make Function or
// Constructor calls, but These named parameters allows us to change order of the arguments passes
// to a function by simply exchanging the order

  def printIntiger( X:Int, Y:Int ) =
  {
    println("Value of X : " + X );
    println("Value of Y : " + Y );
  }

  // code gets executed whenever the parameter is accessed
//  cal by name
  def ArticleCounts1(i: => Int)
  {
    println("Tanya did articles " +
      " on day one is 1 - Total = " + i)
    println("Tanya did articles "+
      "on day two is 1 - Total = " + i)
    println("Tanya did articles " +
      "on day three is 1 - Total = " + i)
    println("Tanya did articles " +
      "on day four is 1 - Total = " + i)
  }

  def ArticleCounts2(i: Int)
  {
    println("Tanya did articles " +
      " on day one is 1 - Total = " + i)
    println("Tanya did articles "+
      "on day two is 1 - Total = " + i)
    println("Tanya did articles " +
      "on day three is 1 - Total = " + i)
    println("Tanya did articles " +
      "on day four is 1 - Total = " + i)
  }

  def something() =
  {
    println("calling something")
    1 // return value
  }

  // Defined function
  def callByName(x: Int) =
  {
    println("x1=" + x)
    println("x2=" + x)
  }

  def Mul(x: Double, y: Double) : Double = x * y

  // Not applying any argument
  val r = Mul _
  val y = Mul(1, _ : Double)
  val z = (Mul _).curried

  def fun(name:String, No:Int)
  {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + No);
  }

  // Function 2
  def fun(No:Int, name:String )
  {
    println("Name of the watch company is:" + name);
    println("Total number of watch :" + No);
  }

}

