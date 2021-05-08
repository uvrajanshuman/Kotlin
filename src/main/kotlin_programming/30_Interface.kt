/*
 *      Implementing Multiple Interfaces
 */

interface MyFirstInterface{
    //abstract method
    fun onTouch()
    //normal method
    fun onClick(){
        println("First Interface: onClick")
    }
}

interface MySecondInterface{
    //normmal method
    fun onTouch(){
        println("Second Interface: onTouch")
    }
    //normal method
    fun onClick(){
        println("Second Interface: onClick")
    }
}
/*
 * if a class implements two interfaces, one having abstract method of same name as normal method of another;
 *      then the implementing class must override that method.
 *
 * if both the interfaces have normal methods with same name;
 *      then the implementing class must override that method.
 */
class MyButton: MyFirstInterface,MySecondInterface{
    override fun onTouch() {
        //MySecondInterface normal method invoked.
        super.onTouch()
    }

    override fun onClick() {
        super<MyFirstInterface>.onClick()
        super<MySecondInterface>.onClick()
    }

}

fun main(args : Array<String>){
    var myBtn = MyButtom()
    myBtn.onTouch();
    myBtn.onClick();
}
