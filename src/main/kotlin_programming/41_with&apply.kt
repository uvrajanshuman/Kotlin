/*
 8      with & apply
 */
class Robot{
    var name : String = ""
    var memory : Int = -1
    fun print(){
        println("Robot: $name , Memory: $memory")
    }
}

fun main(args:Array<String>){
    val robo = Robot()
    with(robo){
        robo.name="Robo1"
        robo.memory= 100
    }
    robo.print()

    //apply return receiver so we can call methods on it too.
    robo.apply {
        robo.name="Robo2"
        robo.memory=200
    }.print()
}