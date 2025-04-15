
var name : String? = null // mutable (changeable)
val greetingValue: String? = null // immutable (unchangeable)

fun sayHallo(greeting : String, itemsToGreet : List<Any>) {
     itemsToGreet.forEach({
         itemToGreet -> println("$greeting $itemToGreet")
     })
}

fun main() {
     val interestingThings = listOf("Kotlin", "Programming", "Comic books", 12, true)
     println("Size : ${interestingThings.size}")
     sayHallo("Hi", interestingThings)
}