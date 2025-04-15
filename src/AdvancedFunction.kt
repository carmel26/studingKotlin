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
    val map = lists
        .filterNotNull()
        .associate { it to it.length }

    map.forEach{
        println("${it.key}, ${it.value}")
    }

    val language = lists.first()
    println(language)
    val lastlanguage = lists.last()
    println(lastlanguage)

    val findAlanguage = lists.filterNotNull().find { it.startsWith("C") }.orEmpty()
    println(findAlanguage)
}