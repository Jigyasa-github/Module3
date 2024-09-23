package Module3_String;
public class StringStartsWith {
    public static void main(String[] args) {
        // Define the strings to compare
        String str1 = "Red is my favorite color.";
        String str2 = "Red";
        
        String str3 = "Orange is also my favorite color.";
        
        // Check if str1 starts with str2
        boolean startsWithStr2 = str1.startsWith(str2);
        
        // Check if str3 starts with str2
        boolean startsWithStr2InStr3 = str3.startsWith(str2);
        
        // Print the results
        System.out.println("\"" + str1 + "\" starts with \"" + str2 + "\"? " + startsWithStr2);
        System.out.println("\"" + str3 + "\" starts with \"" + str2 + "\"? " + startsWithStr2InStr3);
    }
}
