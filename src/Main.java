public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456",100000);
// Create a Customer with your first name and associate the BankAccount
        Customer customer = new Customer("John", myAccount);
// Instantiate the ATM
        ATM atm = new ATM();
        atm.setCurrentCustomer(customer);
// Login
        atm.login(customer.getBankAccount().getAccountNumber());
        // or
        atm.login("123456");

// Perform deposit of 100,000
        atm.deposit(100000);
// Check the balance
        atm.checkBalance();
// Log out the customer
        atm.logout();
    }
}