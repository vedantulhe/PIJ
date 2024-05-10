public class ThreadExample {

    public static void startThreads() {
        // Creating threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        
        // Starting threads
        thread1.start();
        thread2.start();
        
        // Sleeping main thread for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Interrupting threads
        thread1.interrupt();
        thread2.interrupt();
        
        // Waiting for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread exiting.");
    }
}
