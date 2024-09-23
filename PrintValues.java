package Module3_String;
public class PrintValues {

    // Method with parameters (int n, char c)
    public void printValues(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    // Method with parameters (char c, int n)
    public void printValues(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) {
        PrintValues printer = new PrintValues();

        // Call with integer first
        printer.printValues(10, 'A');

        // Call with character first
        printer.printValues('B', 20);
    }
}

