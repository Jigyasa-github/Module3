package Module3_String;
import java.util.HashSet;

public class StringInterleaving {
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";
        
        HashSet<String> resultSet = new HashSet<>();
        interleave(str1, str2, "", resultSet);
        
        // Print the interleaved strings
        System.out.println("The interleaving strings are: ");
        for (String interleaved : resultSet) {
            System.out.println(interleaved);
        }
    }
    
    // Recursive function to generate interleavings
    private static void interleave(String str1, String str2, String interleaved, HashSet<String> resultSet) {
        // If both strings are empty, add the interleaved result to the set
        if (str1.isEmpty() && str2.isEmpty()) {
            resultSet.add(interleaved);
            return;
        }
        
        // If str1 is not empty, add its first character and recurse
        if (!str1.isEmpty()) {
            interleave(str1.substring(1), str2, interleaved + str1.charAt(0), resultSet);
        }
        
        // If str2 is not empty, add its first character and recurse
        if (!str2.isEmpty()) {
            interleave(str1, str2.substring(1), interleaved + str2.charAt(0), resultSet);
        }
    }
}

