class Person(var name : String ){
    //var name : String = ""
    fun display(){
        println("Name of the person is $name")
    }
}

fun main(args : Array<String>){
    var p = Person("Anshuman")
   // p.name = "Anshuman"
    p.display()

}