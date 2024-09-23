package Module3_CollectionEx;
import java.util.HashMap;

public class CheckMapEmpty {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }

        // Adding some key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);

        // Check again if the map is empty
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }

        // Check if the map contains specific key-value mappings
        String keyToCheck = "Apple";
        Integer valueToCheck = 10;

        if (map.containsKey(keyToCheck) && map.get(keyToCheck).equals(valueToCheck)) {
            System.out.println("The map contains the key-value mapping: " + keyToCheck + " = " + valueToCheck);
        } else {
            System.out.println("The map does not contain the key-value mapping: " + keyToCheck + " = " + valueToCheck);
        }
    }
}
