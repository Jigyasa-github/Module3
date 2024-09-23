package Module3;
//Extending the Thread class
class LetterPrinter extends Thread {
 @Override
 public void run() {
     // The code to be executed in the thread
     for (char letter = 'A'; letter <= 'J'; letter++) {
         System.out.println("Letter: " + letter);
         try {
             // Sleep for a short duration to simulate work
             Thread.sleep(500); // Sleep for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 }
}

public class ThreadExample2 {
 public static void main(String[] args) {
     // Create an instance of the LetterPrinter thread
     LetterPrinter letterPrinter = new LetterPrinter();
     
     // Start the thread
     letterPrinter.start();
     
     // Optional: Join the thread to wait for its completion
     try {
         letterPrinter.join(); // Wait for the thread to finish
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }
     
     System.out.println("Main thread finished.");
 }
}
