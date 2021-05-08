/*
 *      secondary constructor
 *      we can not declare property directly in secondary constructor unlike primiary constructor;
 *          Although property of class can be initialized using parameter of secondary constructor
 *      The secondary constructor must include call to primiary constructor;
 *          And primiary constructor is executed before secondary constructor.
 *      If primiary constructor does not exists there is no need of explicit call to primiary constructor.
 */
class Contact(var name: String){
    var age: Int = -1
    init {
        println("Primiary constructor: Name = $name, Age = $age")
    }

    //secondary constructor
    //secondary constructor get executed after execution of init block
    constructor(name: String, age:Int) : this(name){
        this.age = age
        println("Secondary constructor: Name = $name, Age = $age")
    }

    fun method(){
        println("Method: Name = $name, Age = $age")
    }
}

fun main(args:Array<String>){
    //Primiary constructor call
    var contact1 = Contact("Anshuman")
    contact1.method()
    //Secondary constructor
    var contact2 = Contact("Anshuman", 22)
    contact2.method()
}