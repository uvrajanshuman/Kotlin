/*
*   Function as Expression
*   The data present at end of if or else block gets returned.
 */
fun main(args: Array<String>){
    var a : Int = 10
    var b : Int = 20
    println("Max Element ${maxElement(a,b)}")
}

fun maxElement(a: Int, b: Int):Int = if(a>b) a else b

/*
fun maxElement(a: Int, b: Int):Int = if(a>b){
                                          println("Inside if block")
                                          a
                                      }else{
                                          println("Inside else block")
                                          b }

 */