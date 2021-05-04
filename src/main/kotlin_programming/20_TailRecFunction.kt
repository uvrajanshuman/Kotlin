import java.math.BigInteger

/*
*   TailRec Function
*   uses Recursion in more optimised way
*   prevents StackOverflow error
*   prefix tailrec is used
*   tailrec function simply executes the recursion internally without affecting the stack memory;
*               So memory is saved and exception is handled too
 */

fun main(args: Array<String>){
    println(getFibbonacci(100))
}

// 0 1 1 2 3 5 8 13 21
tailrec fun getFibbonacci(n:Int):BigInteger{
    if(n == 0)
        return BigInteger.ZERO
    else if(n == 1)
        return BigInteger.ONE
    else
        return getFibbonacci(n-1) + getFibbonacci(n-2)

}