package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the original ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fruit you want to search for: ");
        String searchFruit = scanner.nextLine();

        // Search for the element
        if (fruits.contains(searchFruit)) {
            System.out.println(searchFruit + " is found in the list.");
        } else {
            System.out.println(searchFruit + " is not found in the list.");
        }

        // Close the scanner
        scanner.close();
    }
}
