package Module3_CollectionEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Print the original HashSet
        System.out.println("Original HashSet: " + fruits);

        // Convert the HashSet to an ArrayList
        List<String> fruitList = new ArrayList<>(fruits);

        // Print the resulting ArrayList
        System.out.println("Converted ArrayList: " + fruitList);
    }
}
