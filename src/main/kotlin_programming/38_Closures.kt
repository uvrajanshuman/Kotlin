/*
 *      Closures:
 *      In Java8 you can not mutate/change the value of outside variables inside lambdas
 *      But in Kotlin this is possible
 */

fun main(args: Array<String>){
    var result: Int = 0
    val obj = Demo();
    //changing the value of result in lambda fn.
    obj.add(5,10){x,y -> result = x+y}
    //printing the changed value of result
    println(result)
}

class Demo{
    fun add(a:Int, b: Int, action: (Int, Int) -> Unit){
        action(a,b)
    }
}