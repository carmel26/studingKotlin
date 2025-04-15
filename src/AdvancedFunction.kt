fun printFilterStrings (list: List<String>, predicate: (String) -> Boolean){
    list.forEach{
        if (predicate(it)){
            println(it)
        }
    }
}


fun main() {
    val lists = listOf("Kotlin", "Java", "C++", "C#")
    printFilterStrings(lists, {it.startsWith("J")})
}