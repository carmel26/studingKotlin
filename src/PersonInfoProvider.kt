interface PersonInfoProvider {
    val providerInfo : String
    fun printInfo(person: Person){
        println(providerInfo)
        person.printUserInfo()
    }
}

// abstract means no need to implement all required methods
class BasicInfoProvider : PersonInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"
}


fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
}