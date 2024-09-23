package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElementAtIndex {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the fruit you want to retrieve: ");
        int index = scanner.nextInt();

        // Retrieve and print the element at the specified index
        if (index >= 0 && index < fruits.size()) {
            String fruit = fruits.get(index);
            System.out.println("Fruit at index " + index + ": " + fruit);
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (fruits.size() - 1) + ".");
        }

        // Close the scanner
        scanner.close();
    }
}
