/*
 *      companion object
 *      companion object are same as object but are declare within a class.
 *      The object members (variable,methods) behave as static but the companion object
 *              actually get converted into static at bytecode level.
 *
 */

class MyClass{
    companion object{
        var count = -1 //Behaves as static member of MyClass

        fun typeOfCustomer():String{   //Behaves as static member of MyClass
            return "Indian"
        }
    }
}

fun main(args: Array<String>){
    println(MyClass.count);
    println(MyClass.typeOfCustomer())
    MyClass.count = 100
    println(MyClass.count)
}