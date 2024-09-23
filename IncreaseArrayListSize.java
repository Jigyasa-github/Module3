package Module3_CollectionEx;
import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity
        ArrayList<String> fruits = new ArrayList<>(2);
        
        // Print the initial capacity (not directly accessible, just for demonstration)
        System.out.println("Initial ArrayList size: " + fruits.size());
        
        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");

        // Print the ArrayList and its size
        System.out.println("Fruits after adding two elements: " + fruits);
        System.out.println("Current size: " + fruits.size());
        
        // Adding more elements to increase the size of the ArrayList
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the ArrayList and its size again
        System.out.println("Fruits after adding more elements: " + fruits);
        System.out.println("Current size: " + fruits.size());
    }
}
