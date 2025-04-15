
var name : String? = null // mutable (changeable)
val greeting: String? = null // immutable (unchangeable)

fun getGreetings() : String {
    return "Hello , It is a new day !"
}

// single expression and we can also remove the type
fun singleExpression() : String = "We are in MweCaU"

// unit means return nothing usable we can even remove it
fun sayHallo() : Unit {
    println(getGreetings())
}
fun main() {
     name = "Kotlin"
     sayHallo()
     println(singleExpression())
}