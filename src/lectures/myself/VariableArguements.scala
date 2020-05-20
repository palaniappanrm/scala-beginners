package lectures.myself
import test.PackageTest
// No default values for any parameters in the method containing the varargs.
  object arr
  {

    // Main method
    def main(args: Array[String])
    {

      val x:PackageTest = new PackageTest
      x.print
      // Creating a method with
      // repeated parameters
      def mul(x: Int*)
      : Int =
      {

        // Applying 'product' method to
        // perform multiplication
        x.product

      }

//      println(mul(1,2))

      // Displays product
//      println(mul(Array(7, 3, 2, 10): _*))
    }
  }

// partial functions - https://www.geeksforgeeks.org/partial-functions-in-scala/
// Lambda expression - https://www.geeksforgeeks.org/lambda-expression-in-scala/
// Function composition - https://www.geeksforgeeks.org/scala-function-composition/
// Implicit conversions - https://www.geeksforgeeks.org/implicit-conversions-in-scala/