
var name : String? = null // mutable (changeable)
val greeting: String? = null // immutable (unchangeable)
fun main() {
     name = "Kotlin"

    // if condition
    if (name != null){
        println("Hello, $name!")
    }else{
        println("Hi")
    }

   // when statement
    when(greeting) {
        null -> println("Hi, this is when")
        else -> println("Greeting from MweCaU!")
    }
}