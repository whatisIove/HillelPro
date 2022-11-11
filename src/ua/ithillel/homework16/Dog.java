package ua.ithillel.homework16;

public non-sealed class Dog extends Animal {
    private boolean isThereHost;

    public Dog(String name, boolean isThereHost) {
        super(name);
        this.isThereHost = isThereHost;
    }

    public boolean isThereHost() {
        return isThereHost;
    }

    public void setThereHost(boolean thereHost) {
        isThereHost = thereHost;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog{name = " + super.getName() + ", " +
                "isThereHost = " + isThereHost +
                '}';
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}