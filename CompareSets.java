package Module3_CollectionEx;
import java.util.HashSet;

public class CompareSets {
    public static void main(String[] args) {
        // Create the first HashSet and add some elements
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        // Create the second HashSet and add some elements
        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Fig");
        set2.add("Grape");

        // Print the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Retain only the elements that are present in both sets
        set1.retainAll(set2);

        // Print the result after retaining common elements
        System.out.println("Common elements in both sets: " + set1);
    }
}
