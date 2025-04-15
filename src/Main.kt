
var name : String? = null // mutable (changeable)
val greetingValue: String? = null // immutable (unchangeable)


fun main() {
    // the instantiation of a new object of the class Person
    val person = Person()
    println("${person.printUserInfo()} ")
}