
var name : String? = null // mutable (changeable)
val greetingValue: String? = null // immutable (unchangeable)

fun sayHallo(greeting : String, itemToGreet : String) {
    val message = "$greeting $itemToGreet"
    println(message)
}

fun main() {
     val interestingThings = arrayOf("Kotlin", "Programming", "Comic books", 12)
     println("Size : ${interestingThings.size}")
//     println(interestingThings[2])
//     println(interestingThings.get(0))

    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }

    interestingThings.forEachIndexed {
        index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}