package A2_LeetCode.JavaPrograms;

public class BankAccount {
    // Create a BankAccount class with methods for depositing
    // withdrawing and checking the balance. Use encapsulation.

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposit of $%.2f successful.%n", amount);
        } else {
            System.out.println("Invalid value");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawal of $%.2f successful.%n", amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        bankAccount.checkBalance();

        //deposit
        bankAccount.deposit(500);
        bankAccount.checkBalance();

        //withdraw
        bankAccount.withdraw(400);
        bankAccount.checkBalance();

    }
}
