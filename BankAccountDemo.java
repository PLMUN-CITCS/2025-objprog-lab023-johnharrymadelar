class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder;
    private double balance;
    protected String accountType;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");
        
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);
        
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
