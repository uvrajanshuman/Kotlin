
fun main(args : Array<String>){
    //break
    for(i in 1..5){
        println(i)
        if(i == 3 )
            break
    }

    println("______________________")

    //labelled break
    outerloop@ for(i in 1..3){
        for(j in 1..3){
            println("$i $j");
            if(i == 2 && j == 2)
                break@outerloop
        }
    }
}