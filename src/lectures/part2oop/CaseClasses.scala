package lectures.part2oop

object CaseClasses extends App{

  /*
  equals, hashCode, toString
   */
  case class Person(name:String, age:Int)
  //1.  class parameters are promoted to fields
  val jim = new Person("jim", 34)
  println(jim.name)

  //2. sensible toString
  // println(instance) = println(instance.toString) // syntactic sugar
  println(jim)

  //3. equals and hashCode implemented out of the box
  val jim2 = new Person("jim",34)
  println(jim == jim2)

  //4. case classes have copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  //5. case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary",23)

  //6. case classes are serializable
  //Akka

  //7. CCS have extractor patterns = CCs can be used in pattern matching

  case object UnitedKingdom {
    def name:String  = "The UK of gb and ireland"
  }




}
