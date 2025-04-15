fun printFilterStrings (list: List<String>, predicate: ((String) -> Boolean)?){
    list.forEach{
        if (predicate?.invoke(it) == true){
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("C")
}

fun getPrintedPredicate(): (String) -> Boolean {
    return {it.startsWith("J")}
}

fun main() {
    val lists = listOf("Kotlin", "Java", "C++", "C#", "Javascript", null)
    lists
        .filterNotNull()
        .filter{
            it.startsWith("C")
        }
        .map{
            it.length
        }
        .forEach {
        println(it)
    }
}