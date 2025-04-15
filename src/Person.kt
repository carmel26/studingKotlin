class Person (val firstName: String, val lastName: String){
// init blocks are executed before the secondary constructor
    init {
        println("init 1")
    }

   constructor() : this("Peter", "Parker"){
       println("Second constructor")
   }
    init {
        println("init 2")
    }

}