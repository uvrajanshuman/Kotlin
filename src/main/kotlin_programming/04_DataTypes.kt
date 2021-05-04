/*
*   All data types in Kotlin is actually an object so it must be initialized. (Kotlin has removed primitives)
*   Data Type   Size(bit)
*   Boolean         1
*   Byte            8
*   Short           16
*   Int             32      By default Integral numbers are of type Int
*   Long            64
*   Float           32
*   Double          64      By default Real number are of type Double
*   Char            16
*   Unit          (similar to void in java)
 */

/*
*   Var vs Val
*   Var: mutable
*        The value of the variable can be changed later.
*   Val: immutable
*        The value of the variable can not be changed later.
 */

fun main(args: Array<String>){
    var name : String
    name = "Anshuman"

    var age = 21

    var isAlive : Boolean = true

    var marks : Float = 97.4F

    var percentage : Double = 90.0

    var gender : Char = 'M'

    println(name)
    println(age)
    println(isAlive)
    println(marks)
    println(percentage)
    println(gender)

}