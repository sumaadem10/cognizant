// First thread class using Thread extension
class MessageThread extends Thread {
    private String message;
    private int count;

    public MessageThread(String message, int count) {
        this.message = message;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " - Count: " + (i + 1));
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Second thread class using Runnable implementation
class MessageRunnable implements Runnable {
    private String message;
    private int count;

    public MessageRunnable(String message, int count) {
        this.message = message;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message + " - Count: " + (i + 1));
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create first thread by extending Thread class
        MessageThread thread1 = new MessageThread("Hello from Thread", 5);
        thread1.setName("ThreadExtend");

        // Create second thread using Runnable interface
        MessageRunnable runnable = new MessageRunnable("Hello from Runnable", 5);
        Thread thread2 = new Thread(runnable, "RunnableThread");

        System.out.println("Starting threads...");

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to complete
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("All threads completed!");
    }
}
