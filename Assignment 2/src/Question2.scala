import scala.annotation.tailrec

object Question2 extends App {

  def getPrimes(i: Int = 1, num:Int):Unit = {
    if(i < num){
      if(isPrime(i, 2)) println(i)
      return getPrimes(i+1, num)
    }
  }

  def isPrime(n: Int, i: Int): Boolean = {
    if(n <=2 ){
      if(n == 2) return true
      else return false
    }
    if(n % i == 0) return false
    if(i * i > n) return true
    isPrime(n, i+1)
  }

  println(getPrimes(1, 10))
}
