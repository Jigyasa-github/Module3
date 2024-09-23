package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
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

        // Method 1: Using Collections.reverse()
        Collections.reverse(fruits);
        System.out.println("Reversed ArrayList (using Collections.reverse): " + fruits);

        // Reset the list to original order
        fruits.clear();
        Collections.addAll(fruits, "Apple", "Banana", "Cherry", "Date", "Elderberry");

        // Method 2: Using a loop to reverse
        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = fruits.size() - 1; i >= 0; i--) {
            reversedList.add(fruits.get(i));
        }

        // Print the reversed ArrayList using a loop
        System.out.println("Reversed ArrayList (using loop): " + reversedList);
    }
}
