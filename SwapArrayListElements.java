package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Scanner;

public class SwapArrayListElements {
    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
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
        System.out.print("Enter the index of the first element to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the index of the second element to swap: ");
        int index2 = scanner.nextInt();

        // Check if indices are valid
        if (index1 < 0 || index1 >= fruits.size() || index2 < 0 || index2 >= fruits.size()) {
            System.out.println("Invalid indices. Please enter indices between 0 and " + (fruits.size() - 1));
        } else {
            // Swap the elements
            String temp = fruits.get(index1);
            fruits.set(index1, fruits.get(index2));
            fruits.set(index2, temp);

            // Print the modified ArrayList
            System.out.println("ArrayList after swapping: " + fruits);
        }

        // Close the scanner
        scanner.close();
    }
}

