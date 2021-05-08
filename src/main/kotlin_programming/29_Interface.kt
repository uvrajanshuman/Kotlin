/*
 *      Interface
 *      Interfaces can contain both normal methods and abstract methods.
 *      Interface can contain only abstract property
 *      Interface can not be instantiated.
 */

//Interface can not be instantiated
interface MyInterface{
    //properties in interface are abstract by default
    var name : String

    //methods in interface are abstract by default
    fun onTouch()

    //Normal method are public and open by default.(not necessary to override)
    fun onClick(){
        println("onClick Interface: Button clicked")
    }
}

class MyButtom : MyInterface{

    //overriding interface property
    override var name = "dummy name"

    //overriding interface abstract method
    override fun onTouch() {
        println("Button Touched")
    }

    //overriding interface normal method (optional)
    override fun onClick(){
        super.onClick()
        println("Button clicked")
    }
}

fun main(args: Array<String>){
    var myBtn = MyButtom()
    myBtn.onTouch()
    myBtn.onClick()
}