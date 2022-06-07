package lectures.part2oop

object Objects extends App{
//Scala does not have class-level functionality ("static")
  object Person { //type  + its only instance
  // static-level functionality
    val N_EYES = 2
    def canFly: Boolean = false
   //factory method - sole purpose is to build Persons
    def from(mother:Person, father:Person):Person = new Person("bobby")
  }
  class Person(val name:String) {
    //instance-level funtionaly
  }
  // class Person and Object Person are 'companions'
  println(Person.N_EYES)
  println(Person.canFly)

  // scala object is a singleton instance
  // person1 and person2 point to the same instance of Person
  // mary and john are separate instances of class Person
  val mary = new Person("marry")
  val john = new Person("john")
  println(mary == john)

  val bobby = Person(mary,john)

  // scala application
  // def main(args:Array[String]):Unit


  val person1 = Person
  val person2 = Person
  println(person1 == person2)



}
