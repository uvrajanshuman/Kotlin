/*
 *      Overriding in kotlin
 *      The classes, methods and methods are public and final by default in kotlin..
 *      To override them open keyword is used, to make them overridable.
 *      In overriden methods and feild variable override keyword is used.
 */

open class Computer{
    open var brand: String = "Generic Brand"
    open fun start(){
        println("Computer started")
    }
}

class WindowsComp : Computer(){
    override var brand: String = "Windows"
    override fun start(){
        println("Windows Computer started")
    }
}

class MacComp : Computer(){
    override var brand :String = "Mac"
    override fun start(){
        println("Mac Computer started")
    }
}

fun main(args: Array<String>){
    var winComp : Computer = WindowsComp()
    var macComp : Computer = MacComp()
    var comp : Computer = Computer()

    winComp.start()
    macComp.start()
    comp.start()


}