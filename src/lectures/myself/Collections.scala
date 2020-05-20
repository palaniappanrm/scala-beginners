package lectures.myself
import Array._
// Lists are immutable whereas arrays are mutable in Scala.
// Used to create back to front -> list.head always holds last inserted value
// Lists represents a linked list whereas arrays are flat
// List represents linked list in Scala
// if we need to create a list that is constantly changing, the preferred approach is to use a ListBuffer
// ListSet -> combination of both -> set implementation using list

// Arrays -> mutable
// Scala arrays can be generic. which mean we can have an Array[T], where T is a type parameter or abstract type.
// Scala arrays are compatible with Scala sequences – we can pass an Array[T] where a Seq[T] is required.
// Scala arrays also support all sequence operations.

// To create a mutable, indexed sequence whose size can change ArrayBuffer class is used
// Tuple is a collection of elements. Tuples are heterogeneous data structures, i.e.,
// is they can store elements of different data types. A tuple is immutable, unlike an array in scala which is mutable

// In Scala, both mutable and immutable sets are available. Mutable set is those set in which
// the value of the object is change but, in the immutable set, the value of the object is not changed itself.
  object Collections
  {
    // Main method
    def main(args:Array[String])
    {
      val rows = 2
      val cols = 3

      // Declaring Multidimension array
      val names = Array.ofDim[String](rows, cols)
      var arr= Array(Array(0, 2, 4, 6, 8),
        Array(1, 3, 5, 7, 9))
      var array1 = range(1, 15)
      val array3 = ('A' to 'F').toArray
      val array2 = ('a' to 'f').by(2).toArray

      // Allocating values
      names(0)(0) = "gfg"
      names(0)(1) = "Geeks"
      names(0)(2) = "GeeksQuize"
      names(1)(0) = "GeeksForGeeks"
      names(1)(1) = "Employee"
      names(1)(2) = "Author"
      for
        {
        i <- 0 until rows
        j <- 0 until cols
      } println(s"($i)($j) = ${names(i)(j)}")

      var values = for
        {
        i <- 0 until rows
        j <- 0 until cols
      } yield names(i)(j)

//      println(values)

      val name = (15, "Chandan", true)

      var set1 = Set("palani");
      val set2 = Set();

      println(set1)
      println(set2)

//    https://www.geeksforgeeks.org/set-in-scala-set-2/
//    reduce, fold and scan - https://www.geeksforgeeks.org/scala-reduce-fold-or-scan/
//    An iterator is a way to access elements of a collection one-by-one. It resembles to a collection
      //    in terms of syntax but works differently in terms of functionality. An iterator defined for
      //    any collection does not load the entire collection into the memory but loads elements one
      //    after the other. Therefore, iterators are useful when the data is too large for the memory

    }
  }
