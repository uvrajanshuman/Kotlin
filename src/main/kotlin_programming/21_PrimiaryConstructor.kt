/*
*   Primiary constructor with just parameter
*   The init is executed immediately after instantiation of the class.
*   Primiary constructor does not has it's own body; However init block
*                      can be treated as a part of primiary constructor.
 */
class Car constructor(name : String){
    /*
     *  name is just declared as parameter of the class ;
     *  And is accessible only in the class.(not even in method of class)
     */
    init{
        println("Car Name: $name")
    }
}

/*
 *      primiary constructor can also be defined as-
 *      class Car constructor(name : String){
 *               init{
 *                   println("Car Name: $name")
 *               }
 *        }
 *      But when no modifier is used the use of constructor keyword is not mandatory
 */
fun main(args: Array<String>){
    var car: Car = Car("BMW")
    /*
     *      println(car.name)
     *      can not access name here.
     *      The name is undefined as it is just declared as parameter not the property
     *      of class Car.
     */
}