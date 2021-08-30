object Question3 extends App {
  def getSum(n: Int, i: Int = 1, sum: Int = 0): Unit = {
    if(i < n+1) getSum(n, i+1, sum+i)
    else println(sum)
  }

  getSum(5)
}
