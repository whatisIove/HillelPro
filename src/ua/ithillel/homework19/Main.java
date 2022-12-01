package ua.ithillel.homework19;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Main {

    public static AtomicInteger counter = new AtomicInteger(22022);

    public static void main(String[] args) throws InterruptedException {

        try (final CloseableExecutorService service = new
                CloseableExecutorService(Executors.newFixedThreadPool(2))) {
            System.out.println("Variable seed is: " + counter);
            decrementOfVariablesInThreads(service);
        }

        final Calculator calculator = new Calculator();
        calculatingNumbsInStreamUsingReentrantLock(calculator);

        final Deadlock.Friend admin = new Deadlock.Friend("admin");
        final Deadlock.Friend user = new Deadlock.Friend("user");
        new Thread(() -> admin.bow(user)).start();
        new Thread(() -> user.bow(admin)).start();

    }

    private static void calculatingNumbsInStreamUsingReentrantLock(Calculator calculator) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Result of calculation:");
                calculator.add(11);
                calculator.subtract(1);
                calculator.calculate();
            });
            thread.start();
            sleep(333);
        }
    }

    private static void decrementOfVariablesInThreads(CloseableExecutorService service) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            service.execute(() -> {
                for (int j = 0; j < 10000; j++) {
                    Thread thread = new Thread(() -> counter.decrementAndGet());
                    thread.start();
                }
            });
        }
        sleep(777);
        System.out.println("Result after decrement " + counter);
    }
}