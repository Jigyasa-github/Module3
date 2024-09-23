package Module3_CollectionEx;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, String> fruitColors = new HashMap<>();

        // Adding some initial key-value pairs to the HashMap
        fruitColors.put("Apple", "Red");
        fruitColors.put("Banana", "Yellow");
        fruitColors.put("Cherry", "Red");
        fruitColors.put("Grape", "Purple");

        // Print the original HashMap
        System.out.println("Original HashMap: " + fruitColors);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit name to add/update: ");
        String fruit = scanner.nextLine();
        System.out.print("Enter the color of the fruit: ");
        String color = scanner.nextLine();

        // Associate the specified value with the specified key
        fruitColors.put(fruit, color);

        // Print the updated HashMap
        System.out.println("Updated HashMap: " + fruitColors);

        // Close the scanner
        scanner.close();
    }
}

