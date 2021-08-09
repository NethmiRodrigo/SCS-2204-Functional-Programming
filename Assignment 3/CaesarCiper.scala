object CaesarCipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val shiftBy = (scala.io.StdIn.readLine("Enter number to shift characters by: ").toInt + alphabet.length) % alphabet.length

  val option = scala.io.StdIn.readLine("Do you wish to encrypt or decrypt(e/d): ")

  val input  = scala.io.StdIn.readLine("Enter text: ")

  var output = ""

  if(option == "e" ) output = encrypt(input)
  else if(option == "d") output = decrypt(input)

  def encrypt(inputString: String): String = {
    inputString.map( (character: Char) => {
      val index = alphabet.indexOf(character.toUpper)
      if(index == -1) character
      else alphabet((index + shiftBy) % alphabet.length)
    })
  }

  def decrypt(inputString: String): String = {
    inputString.map((character: Char) => {
      val index = alphabet.indexOf(character.toUpper)
      if(index == -1) character
      else alphabet((index - shiftBy) % alphabet.length)
    })
  }

  println(output)
}
