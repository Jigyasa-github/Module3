package Module3_CollectionEx;
import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + originalList);

        // Create a second ArrayList to copy elements into
        ArrayList<String> copiedList = new ArrayList<>();

        // Copy elements from originalList to copiedList
        copiedList.addAll(originalList);

        // Print the copied ArrayList
        System.out.println("Copied ArrayList: " + copiedList);
    }
}
