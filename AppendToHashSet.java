package Module3_CollectionEx;
import java.util.HashSet;
import java.util.Scanner;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add some initial fruits to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the original HashSet
        System.out.println("Original HashSet: " + fruits);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit to add to the HashSet: ");
        String newFruit = scanner.nextLine();

        // Add the specified element to the HashSet
        fruits.add(newFruit);

        // Print the updated HashSet
        System.out.println("Updated HashSet: " + fruits);

        // Close the scanner
        scanner.close();
    }
}
