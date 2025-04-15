interface PersonInfoProvider {
    fun printInfo(person: Person)
}

// abstract means no need to implement all required methods
abstract class BasicInfoProvider : PersonInfoProvider


fun main(){
    val provider = BasicInfoProvider()
}