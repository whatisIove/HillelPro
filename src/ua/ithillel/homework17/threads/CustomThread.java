package ua.ithillel.homework17.threads;

public class CustomThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread " + i);
            CustomHelper.getNameOfThreadAndCounter();
        }
    }
}