package lectures.myself

class  Principal
class Teacher extends Principal
class Student extends Teacher

class School
{
  // Declaration of upper bound
  def display [T <: Teacher](t: T)
  {
    println(t)
  }
}

// Object created
object GFG8
{
  // Driver code
  def main(args: Array[String])
  {
    // Defined new variable
    val principal = new Principal
    val teacher = new Teacher
    val student = new Student

    val school = new School

    val x = null
    def useNull(x : Null = null) = println()

    useNull()

    def printNil = println(Nil)

//  Nil is Considered as a List which has zero elements in it
    printNil

    // school.display(principal)
    school.display(teacher)
    school.display(student)

//  Variance - https://www.geeksforgeeks.org/scala-variances/
  }
}
