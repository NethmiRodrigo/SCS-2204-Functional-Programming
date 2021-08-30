object Question6 extends App{
 def fibonnaci(n: Int): Int ={
   if(n<=1) return n
   return fibonnaci(n-1) + fibonnaci(n-2)
 }
  println(fibonnaci(9))
}
