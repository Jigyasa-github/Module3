package Module3;
public class MultipleCatchDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            // This line will cause an ArithmeticException (division by zero)
            int result = 30 / 0;
            // This line will cause an ArrayIndexOutOfBoundsException
            a[5] = result; // This will never be executed due to the previous line
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Exception: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds
            System.out.println("Exception: Array index is out of bounds.");
        } finally {
            // This block executes regardless of whether an exception occurred
            System.out.println("End of operation.");
        }
    }
}
