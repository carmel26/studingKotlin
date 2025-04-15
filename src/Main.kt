
var name : String? = null // mutable (changeable)
val greetingValue: String? = null // immutable (unchangeable)

fun sayHallo(greeting : String, itemToGreet : String) {
    val message = "$greeting $itemToGreet"
    println(message)
}

fun main() {
     val interestingThings = mutableListOf("Kotlin", "Programming", "Comic books", 12, true)
     interestingThings.add("Dogs")
    println("Size : ${interestingThings.size}")
     println(interestingThings.get(4))

    // we can also iterate like we did for the array
    interestingThings.forEach {
        interestingThing -> println(interestingThing)
    }

    // map function which is using key and values
    val mapValues = mutableMapOf( 1 to "a", 2 to "B", 3 to "Cin")
    mapValues.put(5 ,"Jambo")
    mapValues.forEach {
        key, value->
        println("$key -> $value")
    }

}