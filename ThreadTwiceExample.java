package Module3;
//Creating a thread by extending the Thread class
class TestThreadTwice1 extends Thread {
 @Override
 public void run() {
     System.out.println("Thread is running.");
     try {
         // Simulate some work with sleep
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         System.out.println("Thread interrupted: " + e.getMessage());
     }
     System.out.println("Thread has finished execution.");
 }
}

public class ThreadTwiceExample {
 public static void main(String[] args) {
     TestThreadTwice1 t1 = new TestThreadTwice1();
     
     // Starting the thread for the first time
     t1.start();
     
     try {
         // Wait for the first thread to finish
         t1.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }
     
     // Attempting to start the same thread again
     try {
         t1.start(); // This will throw IllegalThreadStateException
     } catch (IllegalThreadStateException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     
     System.out.println("Main thread has completed.");
 }
}
