/*
 *      Data class
 *      The purpose of data class is to just deal with data not the objects.
 *      Data class overrides the methods of Any class; and provides copy() method too.
 *      The copy() method of data class is to create of copy of class object with same data.
 *      The toString() method of data class prints out the values.
 *      In data class a primary constructor can only contain property, parameters are not allowed.
 *
 */

data class _User(var name: String, var id: Int){}

fun main(args: Array<String>){
    var user1 = _User("Anshuman", 10)
    var user2 = _User("Anshuman",10)
    var newUser = user1.copy()
    println(user1)
    println(user2.toString())
    println(newUser)
    if(user1 == user2)
        println("Equal")
    else
        println("Not Equal")
}