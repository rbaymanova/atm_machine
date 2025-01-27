public class ATM {
   private Customer currentCustomer;


    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }

    public void login(String accountNumber){
        if (currentCustomer.bankAccount.getAccountNumber()==accountNumber){
            System.out.println("You have logged in");
        }else {
            System.out.println("Incorrect ID");
        }
    }

    public void logout(){
        currentCustomer = null;
        System.out.println("You have logged out");
    }
    public void deposit(double amount){
        currentCustomer.bankAccount.setBalance(currentCustomer.bankAccount.getBalance() + amount);
        System.out.println("Successfully deposited");
    }

    public void withdraw(double amount){
        if (currentCustomer.bankAccount.getBalance()>=amount){
            currentCustomer.bankAccount.setBalance(currentCustomer.bankAccount.getBalance() - amount);
            System.out.println("Successfully withdrawn");
        }else{
            System.out.println("Invalid funds");
        }
    }
    public void checkBalance(){
        System.out.println(currentCustomer.bankAccount.getBalance());
    }
}
