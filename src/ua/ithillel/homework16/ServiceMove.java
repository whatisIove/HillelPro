package ua.ithillel.homework16;

public sealed interface ServiceMove permits Car {
    void move(Car car);
}