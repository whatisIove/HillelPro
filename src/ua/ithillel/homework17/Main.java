package ua.ithillel.homework17;

import ua.ithillel.homework17.threads.CustomThread;
import ua.ithillel.homework17.threads.CustomThreadCallable;
import ua.ithillel.homework17.threads.CustomThreadRunnable;

import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CustomThread customThread = new CustomThread();
        customThread.setName("First");
        customThread.start();
        customThread.join();

        Thread customThreadRunnable = new Thread(new CustomThreadRunnable());
        customThreadRunnable.setName("Second");
        customThreadRunnable.start();
        customThreadRunnable.join();

        FutureTask<String> futureTask = new FutureTask<>(new CustomThreadCallable());
        Thread threadCallable = new Thread(futureTask);
        threadCallable.setName("Third");
        threadCallable.start();
        threadCallable.join();

        /*
          5.1 - 3 тысячи, последним елементом всегда является 2999.
          5.2 - также, как и без него, 3 тысячи, последний елемент 2999.
          5.3 - если метод synchronized или нет, исходный результат, как с join, так и без него 3 тысячи.
         */
    }
}