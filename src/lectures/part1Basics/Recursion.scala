package lectures.part1Basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App{

  def anotherFactorial (n:Int):BigInt ={
    @tailrec
    def factHelper(x:Int, accumulator:BigInt):BigInt  = {
      if (x<1) accumulator
      else factHelper(x-1,x* accumulator)
    }
    factHelper(n,1)
  }

  def concfun (string:String,times:Int,accumulator: String):String ={
    if (times == 0) accumulator
    else concfun(string,times-1,accumulator + string)
  }

  println(concfun("apple",10,""))

}
