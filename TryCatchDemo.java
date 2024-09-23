package Module3;
import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Attempt to divide the numbers
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // This block executes whether or not an exception occurs
            System.out.println("End of operation.");
        }

        scanner.close();
    }
}
