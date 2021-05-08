/*
 *      Visibility Modifiers        Top Level Declaration          Class Members
 *          public                    Everywhere                    Everywhere
 *          internal                  within the module             within the module
 *          private                   within the file               within the class
 *          protected                 N/A                           within the class and subclass
 *
 */

open class A{
    public var a: Int = 10
    internal var b: Int = 20
    private var c: Int = 30
    protected var d: Int = 40
    fun methodSuper() {
        println("Within Superclass: a:$a, b:$b, c:$c, d:$d")
    }
}

class B: A(){
    fun methodSub(){
        //private variable: c not accessible in sub class
        println("Within Subclass: a:$a, b:$b, d:$d")
    }
}

fun main(args:Array<String>){
    var obj1 = A()
    obj1.methodSuper()
    var obj2 = B()
    obj2.methodSub()
    //private variable: c and protected variable: d not accessible here
    println("Within Main Method: a:${obj1.a}, b:${obj1.b}")
}