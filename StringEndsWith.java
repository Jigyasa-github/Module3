package Module3_String;
public class StringEndsWith {
    public static void main(String[] args) {
        // Define the strings to compare
        String str1 = "Java Exercises";
        String str2 = "se";
        
        String str3 = "Java Exercise";
        
        // Check if str1 ends with str2
        boolean endsWithStr2 = str1.endsWith(str2);
        
        // Check if str3 ends with str2
        boolean endsWithStr2InStr3 = str3.endsWith(str2);
        
        // Print the results
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWithStr2);
        System.out.println("\"" + str3 + "\" ends with \"" + str2 + "\"? " + endsWithStr2InStr3);
    }
}

