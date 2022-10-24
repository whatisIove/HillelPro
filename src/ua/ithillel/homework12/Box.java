package ua.ithillel.homework12;

public class Box<T> {

    private T t;

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

}