/*
*   If Else can also be used as expression
*   And in such case when there are multiple lines of codes in if-else block then the last line of
*   if/else will be returned.
 */
fun main(args: Array<String>){
    val a = 2
    val b = 5
    var maxValue : Int
//    if(a>b)
//        maxValue = a
//    else
//        maxValue = b

    //If as Expression
    maxValue = if(a>b){
                        print("Max value is a: ")
                        a
                }else{
                        print("Max value is b: ")
                        b
                }
    println(maxValue)
}