package Module3_String;
import java.util.Scanner;

public class ComputeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Compute the values of n, nn, and nnn
        int nn = n * 11;   // This is n followed by n
        int nnn = n * 111; // This is n followed by nn

        // Calculate the final result
        int result = n + nn + nnn;

        // Display the result
        System.out.println(n + " + " + nn + " + " + nnn + " = " + result);

        // Close the scanner
        scanner.close();
    }
}

