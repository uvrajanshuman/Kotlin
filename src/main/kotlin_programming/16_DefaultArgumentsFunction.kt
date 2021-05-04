/*
*   Default Functions
*   function parameters can be assigned a default value,
*   And if some value is passed for that parameter it gets overriden
 */
@file:JvmName("KotlinDefaultargs")

fun main(args : Array<String>){
    println("Volume: ${findVolume(10,20)}")
    println("Volume: ${findVolume(10,20,30)}")
}

//Java does not supports Default arguments in functions,
//So, for interoperability @JvmOverloads is used to support function call from Java
@JvmOverloads
fun findVolume(length : Int, breadth : Int, height : Int = 10) : Int{
    return length*breadth*height
}