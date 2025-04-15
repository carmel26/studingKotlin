class Person (val firstName: String = "Peter", val lastName: String = "Parker"){

    var nickName : String? = null
        set(value) {
            field = value
            println("the new NickName is now $value")
        }
        get(){
            println("the return value is $field")
            return field
        }
}