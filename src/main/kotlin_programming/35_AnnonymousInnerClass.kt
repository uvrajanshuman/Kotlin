interface Human{
    var name: String
    fun think()
}

fun main(args:Array<String>){
    //Annonymous Inner Class
    var programmer : Human = object : Human {
        override var name: String = "Anshuman"
        override fun think() {
            println("$name thinks virtually.")
        }
    }

    programmer.think()
}