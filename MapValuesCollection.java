package Module3_CollectionEx;
import java.util.HashMap;
import java.util.Collection;

public class MapValuesCollection {
    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);

        // Print the original HashMap
        System.out.println("Original HashMap: " + map);

        // Get a collection view of the values contained in the map
        Collection<Integer> values = map.values();

        // Print the collection of values
        System.out.println("Collection view of values: " + values);
    }
}
