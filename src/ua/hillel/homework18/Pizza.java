package ua.hillel.homework18;

public class Pizza {
    private boolean pizzaArrived = false;

    public void eatPizza() throws InterruptedException {
        synchronized (this) {
            while (!pizzaArrived) {
                wait();
            }
        }
        System.out.println("yumyum..");
    }

    public void pizzaGuy() {
        synchronized (this) {
            this.pizzaArrived = true;
            notifyAll();
        }
    }
}