package Module3_CollectionEx;
import java.util.HashSet;

public class HashSetSize {
    public static void main(String[] args) {
        // Create a new HashSet and add some elements
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the original HashSet
        System.out.println("HashSet: " + fruits);

        // Get the number of elements in the HashSet
        int size = fruits.size();

        // Print the size of the HashSet
        System.out.println("Number of elements in the HashSet: " + size);
    }
}
