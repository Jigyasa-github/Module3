package Module3_String;

import java.util.Scanner;

	public class CharacterCounter 
	{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Initialize counters
	        int letterCount = 0;
	        int spaceCount = 0;
	        int numberCount = 0;
	        int otherCount = 0;

	        // Loop through each character in the input string
	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                letterCount++;
	            } else if (Character.isDigit(ch)) {
	                numberCount++;
	            } else if (Character.isWhitespace(ch)) {
	                spaceCount++;
	            } else {
	                otherCount++;
	            }
	        }

	        // Display the counts
	        System.out.println("Letters: " + letterCount);
	        System.out.println("Spaces: " + spaceCount);
	        System.out.println("Numbers: " + numberCount);
	        System.out.println("Other characters: " + otherCount);

	        // Close the scanner
	        scanner.close();
	    }
	}



