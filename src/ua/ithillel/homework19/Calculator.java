package ua.ithillel.homework19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Calculator {
    public static class Calculation {
        public static final int UNSPECIFIED = -1;
        public static final int ADDITION = 0;
        public static final int SUBTRACTION = 1;
        int type = UNSPECIFIED;
        public double value;


        public Calculation(int type, double value) {
            this.type = type;
            this.value = value;
        }
    }

    private double result = 0;
    private final Lock lock = new ReentrantLock();

    public void add(double value) {
        lock.lock();
        this.result += value;

    }

    public void subtract(double value) {
        this.result -= value;
    }

    public void calculate(Calculation... calculations) {
        for (Calculation calculation : calculations) {
            switch (calculation.type) {
                case Calculation.ADDITION -> add(calculation.value);
                case Calculation.SUBTRACTION -> subtract(calculation.value);
            }
        }
        System.out.println(result);
        lock.unlock();
    }
}