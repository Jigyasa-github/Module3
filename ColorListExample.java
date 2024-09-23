package Module3_CollectionEx;
import java.util.ArrayList;

public class ColorListExample {
    public static void main(String[] args) {
        // Create a new ArrayList to hold colors
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Print out the colors in the collection
        System.out.println("Colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

