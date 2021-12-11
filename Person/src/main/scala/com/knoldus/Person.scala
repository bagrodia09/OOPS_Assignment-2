package com.knoldus

  class Person(var name: String, var age: Int) extends Ordered[Person] {
    def compare(that: Person): Int = {
      this.name compare that.name match {
        case 0 => if (this.age > that.age)
          println("True")
        else
          println("False")
          0
        case _ => if (this.name.length > that.name.length)
          println("True")
        else
          println("false")
          1

      }
    }

}
