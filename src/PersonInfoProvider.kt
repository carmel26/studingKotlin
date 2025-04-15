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
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvide{
    override val providerInfo: String
        get() = "BasicInfoProvider"

    protected open val sessionIdPrefix = "SessionIdReturned"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional Print Statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}


fun main(){
    val provider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info provider"
        fun getSessionId() = "IdS"
    }

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
