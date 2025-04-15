import java.util.UUID

enum class EntityType{
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase().capitalize()
}
object EntityFactory {

    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.name
        }
        return Entity(id, name)
    }
}

class Entity  (val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main(){
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)

    val medium = EntityFactory.create(EntityType.MEDIUM)
    println(medium)
}