/*
 *      High Level Functions :
 *          - can accept functions as parameters
 *          - can return a function
 *          - or can do both
 *
 *      Lambda: A function without any name
 *
 */
interface SumInterface{
    fun print(sum:Int)
}

class Program{
    //simple method to add two numbers
    fun add(num1: Int, num2: Int){
        val sum = num1 + num2
        println(sum)
    }

    //High level function with Interface object(object of class implementing interface) as parameter
    fun add(num1: Int,num2: Int, action:SumInterface){
        val sum =num1 + num2
        action.print(sum)
    }

    //High level Function with Lambda as a parameter
    fun add(num1: Int,num2: Int, action: (Int) -> Unit){
        val sum = num1 + num2
        action(sum)
    }
}


fun main(args: Array<String>){
    val program: Program = Program()
    program.add(5,10)

    //using interface
    program.add(5,10,object : SumInterface{     //passing interface obj. to high level function
        override fun print(sum: Int) {
            println(sum)
        }
    })

    //using lambdas
    val myLambda: (Int) -> Unit = {s:Int -> println(s)}
    program.add(5,10,myLambda)      //passing lambda to high level function
}