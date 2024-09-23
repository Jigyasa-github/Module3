package Module3_String;
public class PrintNumber {

    // Method to print an integer
    public void printn(int number) {
        System.out.println("Integer: " + number);
    }

    // Method to print a double
    public void printn(double number) {
        System.out.println("Double: " + number);
    }

    // Method to print a float
    public void printn(float number) {
        System.out.println("Float: " + number);
    }

    // Method to print a long
    public void printn(long number) {
        System.out.println("Long: " + number);
    }

    // Main method to test the PrintNumber class
    public static void main(String[] args) {
        PrintNumber printer = new PrintNumber();

        // Testing the overloaded methods
        printer.printn(10);          // Integer
        printer.printn(10.5);        // Double
        printer.printn(10.5f);       // Float
        printer.printn(100000L);     // Long
    }
}
