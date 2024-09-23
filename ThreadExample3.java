package Module3;
//Creating a thread by extending the Thread class
class ThreadOne extends Thread {
 @Override
 public void run() {
     System.out.println("Thread One is starting.");
     try {
         // Sleep for 2000 milliseconds
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         System.out.println("Thread One interrupted: " + e.getMessage());
     }
     System.out.println("Thread One has finished execution.");
 }
}

//Creating a second thread by extending the Thread class
class ThreadTwo extends Thread {
 @Override
 public void run() {
     System.out.println("Thread Two is starting.");
     try {
         // Sleep for 2000 milliseconds
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         System.out.println("Thread Two interrupted: " + e.getMessage());
     }
     System.out.println("Thread Two has finished execution.");
 }
}

public class ThreadExample3 {
 public static void main(String[] args) {
     // Create instances of the threads
     ThreadOne threadOne = new ThreadOne();
     ThreadTwo threadTwo = new ThreadTwo();
     
     // Start the threads
     threadOne.start();
     threadTwo.start();

     // Optional: Join the threads to wait for their completion
     try {
         threadOne.join(); // Wait for threadOne to finish
         threadTwo.join(); // Wait for threadTwo to finish
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }
     
     System.out.println("Both threads have completed execution.");
 }
}
