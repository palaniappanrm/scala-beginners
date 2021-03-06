package lectures.part2oop

/**
  * Created by Daniel.
  */
object CaseClasses extends App {

  /*
    equals, hashCode, toString
   */

  // for case class, class parameters are the object fields
  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = Person("Jim", 34)
  println(jim.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // syntactic sugar
  println(jim)

  // 3. equals and hashCode implemented OOTB
  val jim2 = Person("Jim", 34)
  println(jim == jim2)

  // 4. CCs have handy copy method
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. CCs have companion objects
  val thePerson = Person
  val mary = thePerson("Mary", 23)
  print(mary)

  // 6. CCs are serializable
  // Akka

  // 7. CCs have extractor patterns = CCs can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

  println(UnitedKingdom.name)

  // won't work bec case class need ()
  /*case class UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

  println(UnitedKingdom.name)*/

  class UnitedKingdom {
    def place: String = "The UK of GB and NI"
  }

  println(UnitedKingdom.name)

//  val country = new UnitedKingdom
//  println(country.name)

  /*
    Expand MyList - use case classes and case objects
   */
}
