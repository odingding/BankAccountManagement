import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

<<<<<<< HEAD
=======
    // Constructor to initialize the BankAccount with an account number and initial balance
>>>>>>> 94932dc (Added comments to explain code section)
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

<<<<<<< HEAD
=======
    // Method to handle deposit operation
>>>>>>> 94932dc (Added comments to explain code section)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

<<<<<<< HEAD
=======
    // Method to handle withdrawal operation
>>>>>>> 94932dc (Added comments to explain code section)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

<<<<<<< HEAD
=======
    // Method to get the current balance
>>>>>>> 94932dc (Added comments to explain code section)
    public double getBalance() {
        return balance;
    }

<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

=======
    // Main method to run the Bank Account Management System
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter account details
>>>>>>> 94932dc (Added comments to explain code section)
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

<<<<<<< HEAD
        BankAccount account = new BankAccount(accountNumber, initialBalance);

=======
        // Create a BankAccount object with the entered details
        BankAccount account = new BankAccount(accountNumber, initialBalance);

        // Main loop for user interactions

>>>>>>> 94932dc (Added comments to explain code section)
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

<<<<<<< HEAD
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

=======
            // Prompt user to enter choice
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            // Switch statement to perform the selected operation
>>>>>>> 94932dc (Added comments to explain code section)
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
