
object Account{

  def main(args:Array[String])
  {
    class Account(nicNumber:String,n:Int,b:Double)
    {
      val nic: String = nicNumber
      val accountNumber: Int = n
      var balance: Double = b

      def transfer(a:Account,b:Double): Unit =
      {
        this.balance=this.balance-b
        a.balance=a.balance+b
      }

      override def toString: String =   "["+nic+":"+accountNumber +":"+ balance+"]"
    }

    val firstAccount = new Account("7895201469",1200065,3200)
    val secondAccount = new Account("1005986320",1569800,6000)

    val transferAmount = 6900

    println("Details of the first account (NIC: Account Number: Balance) : "+firstAccount);
    println("Details of the second account (NIC: Account Number: Balance) : "+secondAccount);

    println("\nBalance of the first account prior to the transfer : "+firstAccount.balance);
    println("Balance of the second account prior to the transfer : "+secondAccount.balance);

    val result = firstAccount.transfer(secondAccount,transferAmount)

    println("\n---- Transferring "+transferAmount+" $ from Account 01 to Account 02 ----");

    println("The wew balance of the second account after the transfer:"+secondAccount.balance);
    println("The new balance of the first account after the transfer:"+firstAccount.balance);
  }
}