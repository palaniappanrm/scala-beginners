package lectures.part2oop

/**
  * Created by Daniel.
  */
object Generics extends App {

  class MyList[+A] {
    // use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
      A = Cat
      B = Animal
     */
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  listOfIntegers.add(4.0f)
  val listOfStrings = new MyList[String]

  // generic methods
//  object MyList {
//    def empty[A]: MyList[A] = ???
//  }
//  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
//  val animalList: CovariantList[Cat] = new CovariantList[Animal]
//   animalList.add(new Dog) ??? HARD QUESTION => we return a list of Animals

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]
//  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat]

  // 3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
//  class Cage[A: Animal]{
//    val a:Animal = ???
//  }
//  case class Cage(a: Animal)
//  val animal = new Animal
//  val cage = new Cage

  class Car
  class Skoda

//  class Test[A: Car](a: Car)

//  new Test(new Car)
//  val test = new Test(new Car)

  // generic type needs proper bounded type
//  val newCage = new Cage(new Car)


  // expand MyList to be generic

}
