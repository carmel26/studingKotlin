
var name : String? = null // mutable (changeable)
val greetingValue: String? = null // immutable (unchangeable)


fun main() {
    // the instatiation of a new class
    val person = Person()
    println("${person.lastName} - ${person.firstName}")
    person.nickName = "Benzema"
    person.nickName = "Front"
    println("${person.nickName}")
}