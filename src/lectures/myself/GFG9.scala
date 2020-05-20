package lectures.myself

//The try/catch construct is different in Scala than in Java,
// try/catch in Scala is an expression.
// The exception in Scala and that results in a value can be pattern matched in the catch block
// instead of providing a separate catch clause for each different exception.
// Because try/catch in Scala is an expression

// Control flow will be finally block followed by default exception handling mechanism
// If exception has been occurred in try block
object GFG9 extends App
{

  // Defining a method and applying
  // Either
  def Division(q: Int, r: Int): Either[String, Int] =
  {
    if (r == 0)
    // Left child for failure
    Left("Division not possible.")
      else
      // Right child for success
      Right(q / r)
  }

  // Assigning values
  val x = Division(4, 0)

  // Applying pattern matching
  x match
  {
    case Left(l) =>

      // Displays this if the division
      // is not possible
      println("Left: " + l)

    case Right(r) =>

      // Displays this if division
      // is possible
      println("Right: " + r)
  }
}

// @tailrec:This annotation ensures that a method is tail-recursive.
// Tail-recursion can keep memory requirements constant

// with traits at object level
// https://www.geeksforgeeks.org/scala-self-types-annotation/
