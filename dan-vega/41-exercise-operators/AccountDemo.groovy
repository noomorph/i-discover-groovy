class Account {
  BigDecimal balance = 0
  String type

  BigDecimal deposit(BigDecimal amount) {
    balance += amount
  }

  BigDecimal withdraw(BigDecimal amount) {
    balance -= amount
  }

  BigDecimal plus(Account other) {
    balance + other.balance
  }

  BigDecimal plus(BigDecimal number) {
    balance + number
  }
}

Account checking = new Account(type: "Checking")
checking.deposit(100.00)
Account savings = new Account(type: "Savings")
savings.deposit(51.00)
savings.withdraw(1)

BigDecimal total = checking + savings
println total
