
object Rational{

  class Rational(a:Int, b:Int)
  {
    //Check if denominator is a positive value
    require(b>0)

    //Function to get the greatest common divisor of two numbers. Utility function to get the subtraction given 2 rational numbers
    def gcd(x:Int, y:Int):Int = if(y==0) x else gcd(y,x%y)

    val numer: Int = a/gcd(Math.abs(a),b)
    val denom: Int = b/gcd(Math.abs(a),b)
    def this(i:Int)=this(i,1)

    def +(r:Rational) = new Rational(this.numer*r.denom+this.denom*r.numer,
      this.denom*r.denom)

    def neg=new Rational(-this.numer,this.denom)

    def -(r:Rational): Rational =this + r.neg

    override def toString: String = numer+"/"+denom
  }

  def main(args:Array[String])
  {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
    val res = (x-y)-z

    println("The value of x is: "+x+"\nThe value of y is: "+y+"\nThe value of z is: "+z)
    println("\nThe negative of "+y+" is: "+z.neg)
    println("\nThe subtraction of "+x+" , "+y+ " and "+z+" is: "+res)
  }

}