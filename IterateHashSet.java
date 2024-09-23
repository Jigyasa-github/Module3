package Module3_CollectionEx;
import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create a new HashSet and add some elements
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Method 1: Using for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Method 2: Using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Method 3: Using Streams (Java 8 and above)
        System.out.println("\nIterating using Streams:");
        fruits.stream().forEach(System.out::println);
    }
}

