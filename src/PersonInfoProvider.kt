interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person){
        println(providerInfo)
        person.printUserInfo()
    }
}

interface SessionInfoProvide {
    fun getSessionId(): String
}

// abstract means no need to implement all required methods
class BasicInfoProvider : PersonInfoProvider, SessionInfoProvide{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional Print Statement")
    }

    override fun getSessionId(): String {
        return "SessionIdReturned"
    }
}


fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if (infoProvider !is SessionInfoProvide){
        println("Not a session info provider")
    }else{
        println("Is a session info provider")
        infoProvider.getSessionId()
    }
}
