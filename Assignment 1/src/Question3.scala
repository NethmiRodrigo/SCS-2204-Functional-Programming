object Question3 extends App {

  def shipping(count: Int)= if (count < 30) 3*50.0 else (3*50)+((count-50)*0.75)

  def total_price(count: Int)= 24.95*count

  def discount(price: Double)= price*0.4

  def final_price(count: Int): Double= {
    val total = total_price(count)
    total - discount(total) + shipping(count)
  }

  println("Wholesale price for 60 books: " + final_price(60))
}
