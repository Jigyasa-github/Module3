package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateArrayElement {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the index to update
        System.out.print("Enter the index of the color you want to update: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            // Prompt the user for the new color
            System.out.print("Enter the new color: ");
            String newColor = scanner.next();

            // Update the element at the specified index
            colors.set(index, newColor);

            // Print the updated ArrayList
            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (colors.size() - 1) + ".");
        }

        // Close the scanner
        scanner.close();
    }
}
