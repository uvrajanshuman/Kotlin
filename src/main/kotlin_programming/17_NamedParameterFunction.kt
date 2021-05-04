/*
*   Named Parameter function cal
*   This makes sure correct assignment is done for formal arguments
 */
fun main(args : Array<String>){
    volume(breadth = 10,height = 20,length = 30)
}

fun volume(length : Int, breadth : Int, height : Int){
    println("length: "+length)
    println("breadth: "+breadth)
    println("height: "+height)
}