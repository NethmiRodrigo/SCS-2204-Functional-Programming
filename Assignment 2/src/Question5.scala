object Question5 extends App {
  def evenSum(n: Int, i: Int=1, sum: Int = 0): Int ={
   if(i<n){
     if(i%2==0) evenSum(n, i+1, sum+i)
     else evenSum(n, i+1, sum)
   }
   else return sum
  }
  println(evenSum(10))
}
