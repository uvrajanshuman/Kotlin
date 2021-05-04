/*
*   Infix Function
*   It is Extension Function having only one parameter
*   prefix infix is used
 */
fun main(args: Array<String>){
    val x: Int = 10
    val y: Int = 20
    println(x.greaterValue(y))
    println(x greaterValue y)
}
infix fun Int.greaterValue(other: Int) = if(this>other)this else other