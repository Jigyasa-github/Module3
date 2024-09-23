package Module3_String;
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the two strings
        String concatenatedString = firstString + secondString;

        // Display the result
        System.out.println("Concatenated String: " + concatenatedString);

        // Close the scanner
        scanner.close();
    }
}
