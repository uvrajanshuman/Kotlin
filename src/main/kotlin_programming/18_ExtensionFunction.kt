/*
*   Extension Function
*   used to dynamically add a function to existing classes(predefined or custom)
*   One does not need to modify existing class to add a method
*   The new fn. added acts like static; Kotlin compiler actually converts this into static fn.
 */
fun main(args: Array<String>){
    val student = Student(95)
    println(student.hasPassed())
    println(student.isScholar())

    //Another example of extension function
    val string1 = "Hello"
    val string2 = "World"
    var str3 = "Hey"
    println("String value through extension fn: "+ str3.add(string1,string2))

}

//Adding extension function to String class
fun String.add(string1 : String,string2 : String):String{
    return this+string1+string2
}

//Adding extension function to Student class
fun Student.isScholar():Boolean{
    return marks>90
}
//Student class
class Student(var marks: Int){
    fun hasPassed():Boolean{
        return marks>40
    }
}