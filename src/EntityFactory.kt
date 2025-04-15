import java.util.UUID

enum class EntityType{
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.lowercase().capitalize()
}
object EntityFactory {

    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "HaRd"
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, multiplier = 2f)
            EntityType.HELP ->Entity.Help
        }
    }
}

sealed class Entity  () {
    object Help : Entity(){
        val name = "Help"
    }
    data class Easy(val id :String, val name : String): Entity()
    data class Medium(val id :String, val name : String): Entity()
    data class Hard(val id :String, val name : String, val multiplier: Float): Entity()
}

fun main(){
//    these two entity1 and entity2 are now Equal
    val entity1 = Entity.Easy("123", "John")
    val entity2 = Entity.Easy("123", "John")
//    entity1 and entity3 are not Equal
    val entity3 = entity1.copy(name = "Jean")

    if(entity1 === entity3){
        println("They are equal")
    }else{
        println("They are not equal")
    }
}