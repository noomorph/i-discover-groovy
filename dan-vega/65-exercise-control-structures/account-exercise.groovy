@groovy.transform.InheritConstructors
class DepositException extends Exception {}

class Account {
  def balance = 0.0

  def deposit(BigDecimal amount) {
    if (amount < 0) {
      throw new DepositException('Cannot deposit a negative amount of money')
    }

    balance += amount
    println "Deposited $amount."
    println "The account balance is: $balance"
  } 

  def deposit(BigDecimal[] amounts) {
    amounts.each this.&deposit
  } 
}

def myAccount = new Account()
myAccount.deposit(99.99)

try {
  myAccount.deposit(-15)
} catch (DepositException e) {
  println "\tJust have prevented a crash!\n\t$e"
}

BigDecimal[] amounts = [0.01, 100.0];
myAccount.deposit(amounts)

try {
  myAccount.deposit(10.0, -3.0)
} catch (e) {
  println "\tJust have prevented a crash!\n\t$e"
}

