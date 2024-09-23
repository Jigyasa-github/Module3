package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Elderberry");
        fruits.add("Date");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + fruits);

        // Sort the ArrayList
        Collections.sort(fruits);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + fruits);
    }
}
