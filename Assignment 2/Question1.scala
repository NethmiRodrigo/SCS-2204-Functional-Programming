object Question1 extends App {
  def isPrime(n: Int, i: Int): Boolean = {
    if(n <=2 ){
      if(n == 2) return true
      else return false
    }
    if(n % i == 0) return false
    if(i * i > n) return true
    return isPrime(n, i+1)
  }

  println(isPrime(7, 2))
}