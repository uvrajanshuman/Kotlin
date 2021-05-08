/*
 *      Abstract Classes, Methods and Properties
 *      Abstract classes are classes with partial implementations
 *      An abstract class can not be instantiated
 *      The subclass extending an abstract class must override all its abstract values properties or functions
 *      abstract class, abstract method, abstract variables are open by default; no need to tag them as open explicitly.
 *
 */


//Super class
//abstract class (can't be instantiated)
abstract class Citizen{
    //abstract variable (can't be initialized)
    abstract var name: String
    //abstract methods (can't have body)
    abstract fun obeyRules()
    fun payTaxes(){
        println("Taxes Paid")
    }
}

//Sub class
class Indian : Citizen(){
    override var name: String = "Indian citizen"
    override fun obeyRules() {
        println("$name obeys all the rules")
    }
}

//Main class
fun main(args: Array<String>){
    var indian: Citizen = Indian()
    indian.obeyRules();
    indian.payTaxes()
}