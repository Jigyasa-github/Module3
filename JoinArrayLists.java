package Module3_CollectionEx;
import java.util.ArrayList;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Create the second ArrayList and add some elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        // Print the original ArrayLists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        // Join the two ArrayLists
        ArrayList<String> joinedList = new ArrayList<>(list1); // Initialize with list1
        joinedList.addAll(list2); // Add all elements from list2

        // Print the joined ArrayList
        System.out.println("Joined ArrayList: " + joinedList);
    }
}
