package Module3_String;
public class StringComparison {
    public static void main(String[] args) {
        // Define the strings to compare
        String string1 = "topsint.com";
        String string2 = "topsint.com";
        String string3 = "Topsint.com";
        
        // Compare the strings and print the results
        System.out.println("Comparing \"" + string1 + "\" and \"" + string2 + "\": " + string1.equals(string2));
        System.out.println("Comparing \"" + string3 + "\" and \"" + string2 + "\": " + string3.equals(string2));
    }
}
