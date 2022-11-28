package ua.ithillel.homework17.threads;

import java.util.concurrent.Callable;

public class CustomThreadCallable implements Callable<String> {
    @Override
    public String call() {
        for (int i = 0; i < 1000; i++) {
            CustomHelper.getNameOfThreadAndCounter();
            System.out.println("Callable " + i);
        }
        return "CALLABLE THREAD";
    }
}