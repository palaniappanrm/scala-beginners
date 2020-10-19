package lectures.part2oop

import javafx.scene.chart.XYChart.Series

object Generics2 extends App {

  class Animal

  class Dog extends Animal

//  class Zoo[A : Animal] // wrong

  class Zoo1[A <: Dog](a:A) // dog or child of dog only

  class Zoo2[A <: Animal](a:A) // Animal or child of Animal only

  new Zoo2(new Dog)

  class Series[+A]

  val x: Series[Animal] = new Series[Dog]

//  COVARIANCE, INVARIANCE AND CONTRAVARIANCE

}
