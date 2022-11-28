package ua.ithillel.homework17.threads;

public class CustomThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Runnable " + i);
            CustomHelper.getNameOfThreadAndCounter();
        }
    }
}