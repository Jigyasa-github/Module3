package Module3_CollectionEx;
import java.util.HashMap;

public class CountMapEntries {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, String> fruitColors = new HashMap<>();

        // Adding some initial key-value pairs to the HashMap
        fruitColors.put("Apple", "Red");
        fruitColors.put("Banana", "Yellow");
        fruitColors.put("Cherry", "Red");
        fruitColors.put("Grape", "Purple");
        fruitColors.put("Orange", "Orange");

        // Print the original HashMap
        System.out.println("Original HashMap: " + fruitColors);

        // Count the number of key-value mappings in the HashMap
        int size = fruitColors.size();

        // Print the size of the HashMap
        System.out.println("Number of key-value mappings in the HashMap: " + size);
    }
}
