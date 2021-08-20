
object Bank{

  class Account(nicNumber:String,accNo:Int,balanceAmount:Double)
  {
    val nic: String = nicNumber
    val accountNumber: Int = accNo
    var balance: Double = balanceAmount

    override def toString: String =   "["+nic+":"+accountNumber +":"+ balance+"]"
  }

  def main(args:Array[String])
  {
    var account01 = new Account("12345678",201031,30000)
    var account02 = new Account("987456321",201043,40000)
    var account03 = new Account("852963147",202056,0)
    var account04 = new Account("369852147",203043,-1000)
    var account05 = new Account("456789123",203067,-5000)

    val accounts:List[Account] = List(account01,account02,account03,account04,account05)

    //Function to find accounts with negative balance
    val negativeBalanceAccounts = (b: List[Account]) => b.filter(x=>x.balance.<(0))

    println("The list of accounts who have negative balances : ");
    for(account <- negativeBalanceAccounts(accounts))
      {
        print("NIC: "+account.nic)
        print("\tAccount number: "+account.accountNumber)
        print("\tBalance: "+account.balance)
        println()
      }

    //Sum of the balances in all accounts
    val totalBalance = (b: List[Account]) => b.reduce((x, y)=>new Account(x.nic,x.accountNumber,x.balance+ y.balance))

    println("\n ---- Total balance of all accounts : " + totalBalance(accounts).balance + " ----")

    //Calculating balance of accounts after the interest
    val positiveBalances = (b: List[Account]) => b.filter(x=>x.balance.>(0)).map(x=>x.balance*105/100)
    val negativeBalances = (b: List[Account]) => b.filter(x=>x.balance.<(0)).map(x=>x.balance*11/10)

    println("\n---- The balances of all accounts after adding the interest ----")
    println("nThe new balance who had a positive balance : ")
    for(account <- positiveBalances(accounts))
    {
      print("Balance: "+account)
      println()
    }
    println("\nThe new balance of all accounts who had a negative balance : ")
    for(account <- negativeBalances(accounts))
    {
      print("Balance: "+account)
      println()
    }
  }
}