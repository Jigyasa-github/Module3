package Module3_CollectionEx;
import java.util.ArrayList;

public class ExtractPortionOfArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + fruits);

        // Define the start and end index for extraction
        int startIndex = 2; // inclusive
        int endIndex = 5;   // exclusive

        // Extract the portion of the ArrayList
        ArrayList<String> subList = new ArrayList<>(fruits.subList(startIndex, endIndex));

        // Print the extracted portion
        System.out.println("Extracted portion of the ArrayList: " + subList);
    }
}
