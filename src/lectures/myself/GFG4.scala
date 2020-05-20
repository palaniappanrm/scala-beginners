// private constructors

//In a single class, we are allowed to create one or more than one auxiliary constructors,
// but they have different signatures or parameter-lists.
//Each auxiliary constructor must call one of the previously defined constructors,
// this would be primary constructor or previous auxiliary constructor.
//The invoke constructor may be a primary or previous auxiliary constructor
// that comes textually before the calling constructor.
//The first statement of the auxiliary constructor must contain this keyword

//When we define a subclass in Scala, we control the superclass constructor that is called
// by its primary constructor when we define the extends portion of the subclass declaration.

//To override method in scala override keyword is required.
//Only the primary constructor can pass parameters to the base constructor

class GFG4 private
{
  // Define method
  override def toString = "Welcome to GeeksForGeeks."

  def getInstance():GFG4 = new GFG4()
}

// Creating object of class GFG 
object GFG
{
  // Creating object
//  val gfg = new GFG4
  def getObject = null
}

object SingletonTest extends App
{

  // this won't compile 
  // val gfg = new GFG 
  // this works 
  val gfg = GFG.getObject
  println(gfg)
}