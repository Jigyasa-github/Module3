package Module3_CollectionEx;
import java.util.ArrayList;

public class RemoveThirdElement {
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
        System.out.println("Original ArrayList: " + fruits);

        // Check if the ArrayList has at least 3 elements
        if (fruits.size() >= 3) {
            // Remove the third element (index 2)
            fruits.remove(2);
            System.out.println("ArrayList after removing the third element: " + fruits);
        } else {
            System.out.println("The ArrayList does not contain enough elements to remove the third element.");
        }
    }
}

