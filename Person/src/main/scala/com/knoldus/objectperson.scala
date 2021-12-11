package com.knoldus

object objectperson extends App {
  var Personfirst = new Person("Shubham", 24)
  var Personsecond = new Person("Rahul", 26)
  println(Personfirst < Personsecond)

  var PersonThird = new Person("Test", 28)
  var PersonFourth = new Person("Testagain", 26)
  println(PersonThird < PersonFourth)
}
