package ua.ithillel.homework16;

import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    final static Calendar cal = Calendar.getInstance();
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Car car = new Car(new Engine(620, "MK2", false), new Wheels(4, 20));
        car.move(car);

        Animal animal = new Animal("Bob");
        Dog dog = new Dog("Tom", true);

        if (dog instanceof Animal) {
            System.out.println("right, " + dog);
        }

        String blocks = """ 
                today
                is"""
                + "\n" + cal.get(Calendar.DAY_OF_MONTH) + "\n" + """
                months""" + "\n" + cal.get(Calendar.MONTH);
        System.out.println(blocks);

        String check = null;
        final String checkedObject = Objects.requireNonNullElse(check, "Default string.");
        System.out.println(checkedObject);

        System.out.println("Input animal or dog: ");
        String variable = scanner.nextLine();
        switch (variable) {
            case "animal" -> System.out.println(animal);
            case "dog" -> System.out.println(dog);
            default -> throw new IllegalStateException("Unexpected value: " + variable);
        }

        System.out.println("Input 1 or 2: ");
        int var = scanner.nextInt();
        String result = switch (var) {
            case 1:
                yield "one";
            case 2:
                yield "two";
            default:
                throw new IllegalStateException("Unexpected value: " + var);
        };
        System.out.println(result);

    }
}