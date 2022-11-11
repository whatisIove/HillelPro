package ua.ithillel.homework16;

public record Car(Engine engine, Wheels wheels) implements ServiceMove {

    @Override
    public void move(Car car) {
        if (engine.isWorked() && wheels.quantity() > 4) {
            System.out.println(car + " is move now.");
        } else System.err.println("Fix the engine and check the number of wheels.");
    }

}