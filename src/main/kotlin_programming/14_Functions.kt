/*
*   Functions
*   Unit is equivalent to void in Java
*   As per kotlin coding convention there is no need to specify Unit as return type of a function.
 */
fun main(args: Array<String>){
    //add() //Takes nothing returns nothing
   // add(10,20)    //Takes something returns nothing
    val result : Int
    //result = add();   //Takes nothing returns something
    result = add(10,20)     //Takes something returns something
    print(result)
}

////Takes nothing returns nothing
//fun add():Unit{
//    var a : Int = 10
//    var b: Int = 20
//    println("Sum : ${a+b}")
//}

////Takes something returns nothing
//fun add(a : Int, b: Int){
//    print("Sum : ${a+b}")
//}

//Takes nothing returns something
fun add():Int{
    return 10+20
}

fun add(a: Int, b: Int):Int{
    return a+b
}