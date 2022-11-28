package ua.hillel.homework18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class DeadlockExample {

    private final Lock lockFirst = new ReentrantLock(true);
    private final Lock lockSecond = new ReentrantLock(true);

    public static void main(String[] args) {
        DeadlockExample deadlock = new DeadlockExample();
        new Thread(() -> {
            try {
                deadlock.operationFirst();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "T1").start();
        new Thread(() -> {
            try {
                deadlock.operationSecond();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "T2").start();
    }

    public void operationFirst() throws InterruptedException {
        lockFirst.lock();
        System.out.println("Lock First acquired, waiting to acquire lock2.");
        sleep(50);

        lockSecond.lock();
        System.out.println("Lock Second acquired");

        System.out.println("Executing first operation.");

        lockSecond.unlock();
        lockFirst.unlock();
    }

    public void operationSecond() throws InterruptedException {
        lockSecond.lock();
        System.out.println("Lock Second acquired, waiting to acquire lock1.");
        sleep(50);

        lockFirst.lock();
        System.out.println("Lock First acquired");

        System.out.println("Executing second operation.");

        lockFirst.unlock();
        lockSecond.unlock();
    }
}