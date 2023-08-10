package multithreading;

import java.util.Scanner;

class UserDetailsThread extends Thread {
    private String name;

    public void getUserDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user's name:");
        name = scanner.nextLine();

        scanner.close();
    }
    
    public void run() {
        getUserDetails();

        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello, " + name + "!");
    }
}