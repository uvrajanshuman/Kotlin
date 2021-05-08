/*
 *      Any class
 *      By default every class has a superclass "Any"
 *      Any class contains functions like:
 *          equals():Boolean
 *          hashCode():Int
 *          toString():String
 *      all thease methods are by default present in all kotlin classes
 */
class User(var name: String, var id: Int){}

fun main(args: Array<String>){
    var user1 = User("Anshuman", 10)
    var user2 = User("Anshuman",10)
    println(user1)
    println(user2.toString())
    if(user1 == user2)
        println("Equal")
    else
        println("Not Equal")
}