
fun main(args : Array<String>){

    var r1 = 1 .. 5
    // This range contains the numbers 1,2,3,4,5

    var r2 = 1 .. 5 step 2
    // This range contains the numbers 1,3,5

    var r3 = 5 downTo 1
    // This range contains the numbers 5,4,3,2,1

    var r4 = 5 downTo 1 step 2
    // This range contains the numbers 5,3,1

    var r5 = "a" .. "z"
    // This range contains strings from "a" to "z"

    var r6 = 'A' .. 'Z'
    // This range contains Char from 'A' to 'Z'

    var isPresent = 'K' in r6
    //To check if 'K' is present in Range r6. !in operator can also be used.

    print (isPresent)

    var countDown = 10.downTo(1)
    // This range wiil contain 10 .. 1

    var moveUp = 1.rangeTo(10)
    // This range will contain 1..10

}