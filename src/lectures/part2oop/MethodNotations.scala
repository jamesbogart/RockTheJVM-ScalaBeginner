package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App{

  class Person(val name:String, favoriteMovie:String) {
    def likes(movie:String): Boolean = movie == favoriteMovie
    def +(person: Person):String = s"${this.name} is hanging out with ${person.name}"
    def unary_! :String = s"$name, whaaadaaappppp!"
    def isAlive :Boolean = true
    def apply():String = s"hi mie naym is $name and I liek $favoriteMovie"
  }

  val mary = new Person("mary","inception")
  println(mary.likes("inception"))
  println(mary likes "inception")
  // operator notation, only with methods with one parameter

  //"operators" in scala
  val tom = new Person("tome","fite cluab")
  println(mary + tom)
  println(mary.+(tom))
  println(1.+(2))

  // All operators are methods
  val x = -1
  val y = 1.unary_-
  //unary_ prefix only works with a few operators - + ~ !
  println(!mary)
  println(mary.unary_!)

  //postfix notation
  // if no parameters, can be in postfix notation
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) // equivalent

}
