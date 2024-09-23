package Module3_String;
import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        // Original string
        String originalString = "Tops Technologies!";
        
        // Display the original string
        System.out.println("Original String: " + originalString);
        
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Get character at position 0
        char charAt0 = originalString.charAt(0);
        System.out.println("The character at position 0 is: " + charAt0);
        
        // Get character at position 10
        char charAt10 = originalString.charAt(10);
        System.out.println("The character at position 10 is: " + charAt10);
        
        // Optionally, get a character at a user-defined index
        System.out.print("Enter an index to get the character: ");
        int index = scanner.nextInt();
        
        // Check if the index is within the bounds of the string
        if (index >= 0 && index < originalString.length()) {
            char characterAtIndex = originalString.charAt(index);
            System.out.println("The character at position " + index + " is: " + characterAtIndex);
        } else {
            System.out.println("Index out of bounds!");
        }
        
        // Close the scanner
        scanner.close();
    }
}
