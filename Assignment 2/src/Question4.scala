object Question4 extends App {
    def isEvenOrOdd(n: Int): Unit ={
        if(n < 0) println("Number is negative")
        else if(n == 0) println("Number is even")
        else if(n == 1) println("Number is odd")
        else return isEvenOrOdd(n-1)
    }

    isEvenOrOdd(5)
}
