package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + fruits);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new element to replace the second element: ");
        String newElement = scanner.nextLine();

        // Replace the second element (index 1)
        if (fruits.size() > 1) {  // Check if there is a second element
            fruits.set(1, newElement);
            System.out.println("Updated ArrayList: " + fruits);
        } else {
            System.out.println("The ArrayList does not have a second element.");
        }

        // Close the scanner
        scanner.close();
    }
}
