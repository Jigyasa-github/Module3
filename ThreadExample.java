package Module3;
//Implementing the Runnable interface
class NumberPrinter implements Runnable {
 @Override
 public void run() {
     // The code to be executed in the thread
     for (int i = 1; i <= 10; i++) {
         System.out.println("Number: " + i);
         try {
             // Sleep for a short duration to simulate work
             Thread.sleep(500); // Sleep for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 }
}

public class ThreadExample {
 public static void main(String[] args) {
     // Create an instance of the Runnable implementation
     NumberPrinter numberPrinter = new NumberPrinter();
     
     // Create a thread using the Runnable instance
     Thread thread = new Thread(numberPrinter);
     
     // Start the thread
     thread.start();
     
     // Optional: Join the thread to wait for its completion
     try {
         thread.join(); // Wait for the thread to finish
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }
     
     System.out.println("Main thread finished.");
 }
}
