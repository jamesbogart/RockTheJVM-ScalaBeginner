package exercises

abstract class MyList[+A] {

  /*
  head = first element of the list
  tail = remainder of the list
  isEmpty = boolean
  add(int) => new list with element added
  toString => a string representatin of a list
   */

  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B>:A](element:B):MyList[B]
  def printElements:String
  override def toString: String = "[" + printElements + "]"

}

case object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element:B):MyList[B] = new Cons(element,Empty)

  override def printElements: String = ""

}

case class Cons[+A](h:A,t:MyList[A]) extends MyList[A]{
  def head:A = h
  def tail:MyList[A] = t
  def isEmpty: Boolean = false
  def add[B>:A](element:B):MyList[B] = new Cons(element,this)

  override def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " "  + t.printElements
  }
}

object ListTest extends App {
  val list = new Cons(1,new Cons(2, new Cons(3,Empty)))
  println(list.head)
}