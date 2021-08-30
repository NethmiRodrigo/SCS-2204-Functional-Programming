object Question2 extends App{
  def calculateVolume(r:Double)=(r*r*r)*(4.0/3.0)*Math.PI

  println("Volume of a sphere of radius 5: " + calculateVolume(5.0))
}