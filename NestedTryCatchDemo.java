package Module3;
public class NestedTryCatchDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            try {
                // Attempt to perform division that may throw an ArithmeticException
                int result = 30 / 0; // This will throw an ArithmeticException
                // Attempt to assign value to an array index that may throw an ArrayIndexOutOfBoundsException
                a[5] = result; // This line will not be executed due to the previous exception
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Inner Exception: Division by zero is not allowed.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds
            System.out.println("Outer Exception: Array index is out of bounds.");
        } finally {
            // This block executes regardless of whether an exception occurred
            System.out.println("End of operation.");
        }
    }
}
