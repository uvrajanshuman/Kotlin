

class Sum{

    fun add(a: Int, b:Int, func: (Int) -> Unit){
        val sum = a+b
        func(sum)
    }

    fun add(a:Int, b:Int, func: (Int ,Int) -> String){
        val sum = func(a,b)
        println(sum)
    }
}

fun main(args: Array<String>){
    val obj = Sum()

    obj.add(5,10,{x,y -> (x+y).toString()})

    obj.add(5,10){x -> println(x)}

    val lambda = {x:Int -> println(x)}
    obj.add(5,10,lambda)
}