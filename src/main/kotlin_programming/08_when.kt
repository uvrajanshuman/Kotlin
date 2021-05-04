/*
*   when in kotlin is similar to switch in Java/C/C++
*   Here, break is not required.
 */
fun main(args : Array<String>){
    val x = 5
    when(x){
        //Multiple conditions
        0,1 -> println("x value is 0 or 1")

        //Range as condition
        in 2 .. 5 -> println("x value is in range 2 to 5")

        //Single condition
        6 -> println("x value is 6")

        //default block
        else -> {
            println("x value is Unknown")
        }
    }

    //when as expression
    var str = when(x){
        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            println("x is unknown")
            "x is alien"
        }
    }
    println("value of String: " +str)
}