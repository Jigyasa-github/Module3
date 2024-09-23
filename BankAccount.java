package Module3;
import java.util.Scanner;

public class BankAccount {

    private double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw amount
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + shortfall + " Rs. to perform this transaction.");
        }
        balance -= amount; // Deduct the amount from the balance
        System.out.println("Withdrawal successful. Remaining balance: " + balance + " Rs.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(2000); // Initial balance

        System.out.print("Enter withdraw amount: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount); // Attempt to withdraw amount
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("End of transaction.");
        }

        scanner.close();
    }
}
