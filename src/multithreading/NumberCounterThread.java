package multithreading;

class NumberCounterThread extends Thread {
    public void run() {
        int count = 1;

        while (!Thread.interrupted()) {
            System.out.println("Count: " + count);
            count++;

            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}