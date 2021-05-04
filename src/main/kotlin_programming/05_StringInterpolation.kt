/*
*   String Template/String Interpolation
*   Both + and $ can be used for concatenation.
 */

fun main(){
    val name = "Anshuman"
    val string = "Hello $name"

    println(string)
    println("Length of string is ${string.length}")

    var l = 10
    var b = 20

    println("The length of Rectangle is $l and the breadth of Rectangle is $b")
    print("Area of Rectangle : ${l*b}")
}