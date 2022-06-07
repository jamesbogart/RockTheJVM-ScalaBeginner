package lectures.part2oop

object Inhereitance extends App{

  // single class inheritance
  class Animal {
    protected  def eat = println("eat")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("cunch")
    }
  }

  val cat = new Cat
  cat.eat

  // constructors
  class Person(name:String, age:Int) {
    def this(name:String) = this(name,0)
  }
  class Adult (name:String, age:Int, idCard:String) extends Person (name)

  //override
  class Dog extends Animal {
    override def eat = println("unch runch")
  }
  val dog = new Dog
  dog.eat
}
