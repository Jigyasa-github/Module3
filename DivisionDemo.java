package Module3;
import java.util.Scanner;

public class DivisionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();

        try {
            // Attempt to divide the numbers
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception and print the exception message
            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
        } finally {
            // This block executes whether or not an exception occurs
            System.out.println("End of operation.");
        }

        scanner.close();
    }
}
