/*
 *      Primiary constructor with property
 *
 */

/*
class Bus(name: String){
    var name : String
    init {
        this.name = name
        println("Constructor: Bus name: $name")
    }

}
 */

//Property declared directly in primiary constructor itself.
class Bus(var name: String){
    /*
     * name declared as property of the class
     */
    init {
        println("Constructor: Bus name: $name")
    }
}


fun main(args:Array<String>){
    var bus: Bus = Bus("TATA")
    println("Main Method: Bus Name: ${bus.name}")
}