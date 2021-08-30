import scala.math.{pow, sqrt}

case class Coordinate(var x: Int, var y: Int) {

  //Method to add two given points
  def +(coord: Coordinate): Coordinate = Coordinate(x + coord.x, y + coord.y)

  //Method to move a point by a given distance dx and dy
  def move(dx: Int, dy: Int): Unit ={
    this.x = this.x + dx
    this.y = this.y + dy
  }

  //Method to return the distance between two points
  def distance(coord: Coordinate): Double = {
    sqrt( pow(coord.x - this.x, 2 ) + pow(coord.y - this.y, 2) )
  }

  //Method to switch the x and y coordinates
  def invert(): Unit = {
    var temp = this.x
    this.x = this.y
    this.y = temp
  }
}

object Point extends App {
  var first = Coordinate(2,2)
  var second = Coordinate(5,3)
  var third = Coordinate(4,1)

  println("The coordinates of the first point before moving it: (" + first.x + "," + first.y + ")")
  first.move(2, 2)
  println("The coordinates of the first point after moving it: (" + first.x + "," + first.y + ")")

  println("The distance between the second point and the third point is: " + third.distance(second))

  println("The third point before inverting is : (" + third.x + "," + third.y + ")")
  third.invert()
  println("The third point after inverting is : (" + third.x + "," + third.y + ")")
}
