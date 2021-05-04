
fun main(args : Array<String>){
    //continue
    for(i in 1..10){
        if(i%2 == 0)
            continue
        println(i)
    }

    println("______________________")

    //labelled continue
   outerloop@ for(i in 1..3){
        for(j in 1..3){
            if(i==2 && j==2)
                continue@outerloop
            println("$i $j")
        }
    }
}