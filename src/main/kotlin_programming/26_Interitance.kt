open class Phone(var name:String){
    var refurbished: Boolean = false
    init{
        println("Super Class init block, name: $name")
    }
    constructor(name : String,refurbished: Boolean) : this(name){
        this.refurbished = refurbished
        println("Super Class Secondary constructor, name: $name, refurbished: $refurbished")
    }
}

class Android(_name : String, var brand:String):Phone(_name){
    init{
        println("Sub Class init block, name: $name, brand: $brand")
    }
    constructor(name: String, brand: String, price: Int):this(name,brand){
        println("Sub class secondary constructor, name: $name, brand: $brand, price: $price, refurbished: $refurbished")
    }
}

fun main(args: Array<String>){
    //var phone: Phone = Android("Ph-001","Samsung")
    var phone2: Phone = Android("Ph-002","Apple",1000)
}