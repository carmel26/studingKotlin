
var name : String? = null // mutable (changeable)
val greetingValue: String? = null // immutable (unchangeable)

// vararg means variable number of arguments means we can pass it or not
fun sayHallo(greeting : String, vararg itemsToGreet : String) {
     itemsToGreet.forEach({
         itemToGreet -> println("$greeting $itemToGreet")
     })
}

fun greetPerson(greeting: String = "Hello", name: String = "Blandon") = println("$greeting $name")

fun main() {
     val interestingThings = arrayOf("Kotlin", "Programming", "Comic books", "12", "true")
      sayHallo(itemsToGreet = *interestingThings, greeting = "Bonjour",)
}