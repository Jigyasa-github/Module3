package Module3;
public class CommandLineDivision {

    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        try {
            // Parse command line arguments as integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform the division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("Exception: Please provide valid integers.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // This block executes regardless of whether an exception occurred
            System.out.println("End of operation.");
        }
    }
}

