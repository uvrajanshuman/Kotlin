/*
 *      object class : creates singleton class
 *      Singleton: There exists a single instance of class in whole application
 *      The single instance is created by kotlin itself and can't be created manually.
 *              and the instance is accessed with the class name directly.
 *
 *      In kotlin we can not declare static variables and methods; object class can be the alternative.
 *      Object class -
 *          - can have properties, methods and initializers.
 *          - can not have constructors. (as manual instantiation not allowed)
 *          - can have super class (supports inheritance).
 *
 *
 */

//Super class
open class MySuperClass{
    open fun myMethod(){
        println("My super class")
    }
}

//object class can also inherit another class.
//Sub class
object CustomerData : MySuperClass(){
    var count: Int = -1;    //Behaves like static variable

    init {
        //can have initializer block too
        println("CustomerData: single instance created")
    }

    fun typeOfCustomer():String{     //Behaves like static method
        return "Indian"
    }

    override fun myMethod() {       //overriden method of super class will behave like static method of subclass
        super.myMethod()
        println("object class overridden method")
    }

}

fun main(args: Array<String>){
    CustomerData.count =100; //property of CustomerData class accessed without creating instance
    println(CustomerData.count)
    println(CustomerData.typeOfCustomer())  //method of CustomerData class accessed without creating instance
    CustomerData.count=0    //value modified
    println(CustomerData.count)
    CustomerData.myMethod();        //overriden method of CustomerData class accessed without creating instance

    var mySuperClass = MySuperClass()
    mySuperClass.myMethod()     //method of MySuperClass (super class of object class) requires instance for method invocation.
}