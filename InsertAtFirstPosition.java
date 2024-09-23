package Module3_CollectionEx;
import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Insert an element at the first position
        colors.add(0, "Yellow");

        // Print the modified ArrayList
        System.out.println("ArrayList after inserting 'Yellow' at the first position: " + colors);
    }
}
