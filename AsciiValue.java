package Module3_String;

import java.util.Scanner;

	public class AsciiValue {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for a character
	        System.out.print("Enter a character: ");
	        char inputChar = scanner.next().charAt(0);

	        // Get the ASCII value of the character
	        int asciiValue = (int) inputChar;

	        // Display the ASCII value
	        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

	        // Close the scanner
	        scanner.close();
	    }
	}


