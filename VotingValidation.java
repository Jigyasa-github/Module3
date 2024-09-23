package Module3;
import java.util.Scanner;

public class VotingValidation {

    // Method to validate age
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or older to vote.");
        } else {
            System.out.println("Welcome to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            int age = scanner.nextInt();
            validate(age); // Call the validate method
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            System.out.println("End of operation.");
        }

        scanner.close();
    }
}
