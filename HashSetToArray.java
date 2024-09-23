package Module3_CollectionEx;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Print the original HashSet
        System.out.println("Original HashSet: " + fruits);

        // Convert the HashSet to an array
        String[] fruitArray = new String[fruits.size()];
        fruitArray = fruits.toArray(fruitArray);

        // Print the resulting array
        System.out.println("Converted Array: ");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }
    }
}
