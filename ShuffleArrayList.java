package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
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

        // Shuffle the ArrayList
        Collections.shuffle(fruits);

        // Print the shuffled ArrayList
        System.out.println("Shuffled ArrayList: " + fruits);
    }
}

