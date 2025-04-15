class Person (val firstName: String = "Peter", val lastName: String = "Parker"){

    var nickName : String? = null
        set(value) {
            field = value
        }
        get(){
            return field
        }
    fun printUserInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
}