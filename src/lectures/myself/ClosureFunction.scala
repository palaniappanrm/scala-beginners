package lectures.myself

// A closure function can further be classified into pure and impure functions,
// depending on the type of the free variable. If we give the free variable a type var
// then the variable tends to change the value any time throughout the entire code
// and thus may result in changing the value of the closure function. Thus this closure is a impure function.
// On the other-hand if we declare the free variable of the type val then the value of the variable remains constant
// and thus making the closure function a pure one

object ClosureFunction extends App {

  var employee = 50

  // define closure function
  val gfg = (name: String) => println(s"Company name is $name"+
    s" and total no. of employees are $employee")

  gfg("geeksforgeeks")

  employee = 60

  gfg("geeksforgeeks")

  def author = println("Palani")
  def author1() = println("Palani")

  author
  author1

//  tail recursive -> return statement contains only the method call without holding any extra value
//  https://www.geeksforgeeks.org/recursion-in-scala/
//  A recursive function is said to be tail recursive if the recursive call is the last thing done by the function.
//  There is no need to keep record of the previous state

// Scope and access modifiers - https://www.geeksforgeeks.org/controlling-method-scope-in-scala/

}
