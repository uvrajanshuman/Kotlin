/*
 *      Inheritance
 *      In Kotlin by default the classes are public and final; so can't be inherited directly
 *      To inherit a super class it must be declared as open
 */

//Parent class
open class Animal{
    var color:String = ""
    fun eat(){
        println("Eat")
    }
}

//subclass of Animal
class Dog : Animal(){
    var breed : String = ""
    fun bark(){
        println("Bark")
    }
}

//subclass of Animal
class Cat : Animal(){
    var age : Int = -1
    fun meow(){
        println("Meow")
    }
}

fun main(args: Array<String>){
    var dog = Dog()
    dog.color = "Black"
    dog.breed = "Lab"
    println("Dog: color = ${dog.color}, breed = ${dog.breed}")
    dog.eat();
    dog.bark();

    var cat = Cat()
    cat.color = "White"
    println("Cat: color = ${cat.color}, age = ${cat.age}")
    cat.age = 4
    cat.eat()
    cat.meow()

    var animal = Animal()
    animal.color = "Grey"
    println("Animal: color = ${animal.color}")
    animal.eat()


}