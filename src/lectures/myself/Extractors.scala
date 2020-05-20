package lectures.myself

// https://www.geeksforgeeks.org/scala-for-comprehensions/
// https://www.geeksforgeeks.org/scala-sequence-comprehensions/
// https://www.geeksforgeeks.org/the-factory-pattern-in-scala/
// https://www.geeksforgeeks.org/scala-lazy-evaluation/ - Spark a big data computation engine uses this technique at it’s core
// Collections that support map as well as flatMap are called as monadic. Now, let’s see some examples of Monads in Scala
// https://www.geeksforgeeks.org/monads-in-scala/
// Lazy and Seq - https://www.geeksforgeeks.org/lazy-val-and-infinite-sequences-in-scala/
// Streams - https://www.geeksforgeeks.org/scala-stream/
// Important in stream -> no infinite loop -> https://www.geeksforgeeks.org/recursive-streams-and-collection-in-scala/
// placeholder -> _ = https://www.geeksforgeeks.org/placeholder-syntax-in-scala/
// Difficult -> https://www.geeksforgeeks.org/scala-sieve-of-eratosthenes/
// When comparing an extractor object using the match statement the unapply method will be automatically executed
// https://www.geeksforgeeks.org/using-extractors-with-pattern-matching-in-scala/
// Getter and setter -> https://www.geeksforgeeks.org/overriding-accessors-and-mutators-in-scala/

  object Extractors
  {

    // Main method
    def main(args: Array[String])
    {

      // Assigning value to the
      // object
      val x = Extractors(25)

      // Displays output of the
      // Apply method
      println(x)

      // Applying pattern matching
      x match
      {
        // unapply method is called
        case Extractors(x) => println("The value is: "+x)
        case _ => println("Can't be evaluated")

      }
    }

    // Defining apply method
    def apply(x: Double) = x / 5

    // Defining unapply method
    def unapply(z: Double): Option[Double] =

      if (z % 5 == 0)
      {
        Some(z/5)
      }

      else None
  }
