package lectures.part2oop

object AbstractDatatypes extends App{
  //abstract members (unimplemented)
  abstract class Animal  {
    val creatureType:String
    def eat:Unit
  }

  class Dog extends Animal {
    val creatureType: String = "canine"
    def eat:Unit = println("cnl;askdjfa;lkj")
  }

  //traits
  trait Carnivore {
    def eat(animal:Animal):Unit
    val preferredMeal:String = "fresh meat"
  }

  trait Coldblodded
   class Crocodile extends Animal with Carnivore with Coldblodded {
     override val creatureType: String = "croc"
     def eat: Unit = println("nom")
     def eat(animal: Animal):Unit = println(s"I am a croc and I am eating a ${animal.creatureType}")

   }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits do not have constructor parameters
  //multiple traits may be inherited by the same class
  //traits = behavior, abstract class is a type of thing
}
