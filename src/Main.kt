
var name : String? = null // mutable (changeable)
val greeting: String? = null // immutable (unchangeable)
fun main() {
     name = "Kotlin"
     val greetingToPrint = if(greeting != null) name else " Hi"
     var newGreetingVal = when(name){
         null -> " How are you?"
         else -> name
     }
     println("Hello, $greetingToPrint!")

}