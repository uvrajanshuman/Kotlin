
@file:JvmName("KotlinEx")
//The file while being converted into .class file will be named as KotlinEx.class

package interoperability


fun main(args:Array<String>){
    //calling Java method
    var result = JavaFile.add(30,40)
    println("Printing sum from Kotlin File: $result")
}

//Kotlin Method for addition of two numberss
fun add(a:Int, b:Int):Int{
        println("Inside Kotlin Method")
        return a+b
}
