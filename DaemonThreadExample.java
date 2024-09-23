package Module3;
//Creating a thread by extending the Thread class
class TestDaemonThread2 extends Thread {
 @Override
 public void run() {
     // Print the status of the thread
     System.out.println(Thread.currentThread().getName() + " is running. Daemon: " + this.isDaemon());
     try {
         // Simulate some work with sleep
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         System.out.println(Thread.currentThread().getName() + " interrupted: " + e.getMessage());
     }
     System.out.println(Thread.currentThread().getName() + " has finished execution.");
 }
}

public class DaemonThreadExample {
 public static void main(String[] args) {
     TestDaemonThread2 t1 = new TestDaemonThread2(); // First thread
     TestDaemonThread2 t2 = new TestDaemonThread2(); // Second thread
     
     // Set t1 as a daemon thread
     t1.setDaemon(true); // This should be done before starting the thread

     // Start both threads
     t1.start();
     t2.start();
     
     // Check if t1 is a daemon thread
     System.out.println("Is t1 a daemon thread? " + t1.isDaemon());

     // Join the non-daemon thread to wait for its completion
     try {
         t2.join(); // Wait for t2 to finish
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }

     System.out.println("Main thread has completed.");
 }
}
