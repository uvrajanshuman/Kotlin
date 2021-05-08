/*
 *      it: Implicit name of single parameter in lambda fn.
 *      This is applicable only when there is single parameter in lambda fn.
 */

class StringRev{

    fun reverseDisplay(myString:String,action: (String)->String){
        var result = action(myString)
        println(result)
    }
}

fun main(args:Array<String>){
    val obj = StringRev()

    obj.reverseDisplay("Hello"){s -> s.reversed()}
    //OR
    // it can be used as implicit name of single parameter in lambda fn.
    obj.reverseDisplay("Hello World"){it.reversed()}
    //it.reversed() ==> ("Hello World").reversed
}
/*
 *     {it.reversed()} is equivalent to {s -> s.reversed()} as the lambda fn. has single param.
 */