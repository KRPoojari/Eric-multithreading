package multithreading;

import multithreading.NumberCounterThread;
import multithreading.UserDetailsThread;

public class MultithreadExample {
    public static void main(String[] args) {
        UserDetailsThread userDetailsThread = new UserDetailsThread();
        NumberCounterThread numberCounterThread = new NumberCounterThread();

        userDetailsThread.start();
        numberCounterThread.start();

        try {
            userDetailsThread.join(); // Wait for userDetailsThread to complete
            numberCounterThread.interrupt(); // Interrupt numberCounterThread
            numberCounterThread.join(); // Wait for numberCounterThread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}