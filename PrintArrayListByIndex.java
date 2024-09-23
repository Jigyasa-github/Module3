package Module3_CollectionEx;
import java.util.ArrayList;

public class PrintArrayListByIndex {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the elements using their positions (indices)
        System.out.println("Elements of the ArrayList:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at index " + i + ": " + fruits.get(i));
        }
    }
}
