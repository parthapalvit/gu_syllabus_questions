 //Write a java program to create an Account class and define constructors in it. Inherit
 //Saving_Bank_Accountclass andCurrent_Bank_Account class from the Account class. Override
//constructors of Account class in Saving_Bank_Account and Current_Bank_Account classes.
//Define appropriate methods to operate these accounts. Make necessary assumptions. Give proper
//comment in your program to increase redability. 



class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance is " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance is " + balance);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}

// Saving_Bank_Account class
class Saving_Bank_Account extends Account {

    // Constructor
    public Saving_Bank_Account(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        System.out.println("Saving_Bank_Account created with account number " + accountNumber);
    }
}

// Current_Bank_Account class
class Current_Bank_Account extends Account {

    // Constructor
    public Current_Bank_Account(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        System.out.println("Current_Bank_Account created with account number " + accountNumber);
    }
}

// Main class
public class Bankapp{

    public static void main(String[] args) {

        // Create Saving_Bank_Account and Current_Bank_Account objects
        

Saving_Bank_Account savingsAccount = new Saving_Bank_Account("123456", "John Doe", 1000.0);
Current_Bank_Account currentAccount = new Current_Bank_Account("789012", "Jane Smith", 5000.0);



    }
}