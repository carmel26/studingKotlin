
var name : String? = null // mutable (changeable)
val greetingValue: String? = null // immutable (unchangeable)

fun sayHallo(greeting : String, itemToGreet : String) {
    val message = "$greeting $itemToGreet"
    println(message)
}

fun main() {
     name = "Kotlin"
    sayHallo("Hello ", "Word!")
    sayHallo("Hey ", " my Friend")
}