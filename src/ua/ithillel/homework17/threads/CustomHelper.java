package ua.ithillel.homework17.threads;

public class CustomHelper {
    private static int counter = 0;

    public static synchronized void getNameOfThreadAndCounter() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " " + counter);
        ++counter;
    }
}
