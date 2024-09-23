package Module3_CollectionEx;
import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        // Create the second ArrayList and add some elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        // Create a third ArrayList with different elements
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Date");
        list3.add("Elderberry");
        
        // Compare the two ArrayLists
        boolean areEqual1 = list1.equals(list2);
        boolean areEqual2 = list1.equals(list3);

        // Print the results
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
        System.out.println("Are List 1 and List 2 equal? " + areEqual1);
        System.out.println("Are List 1 and List 3 equal? " + areEqual2);
    }
}
