public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
      balance += amount;
        System.out.println("Successfully deposited");
    }

    public void withdraw(double amount){
        if (balance>=amount) {
            balance -= amount;
            System.out.println("Successfully withdrawn");
        }else {
            System.out.println("Not enough funds");
        }
    }
}
