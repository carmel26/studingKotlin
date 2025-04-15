interface IdProvider {
    fun getId() :String
}

class Entity private constructor(val id: String) {

    companion object Factory : IdProvider {
        override fun getId(): String {
             return "12342"
        }

        const val id = "id"

        fun create() = Entity(id)
    }
}

fun main(){
    val entity = Entity.Factory.create()
    Entity.id
}