package ua.ithillel.homework2;

public class Oven extends KitchenAppliances {

    private int numberOfPrograms;
    private String typeOfOven;
    private int maximumTemperature;

    public Oven(int numberOfPrograms, String typeOfOven, int maximumTemperature) {
        this.numberOfPrograms = numberOfPrograms;
        this.typeOfOven = typeOfOven;
        this.maximumTemperature = maximumTemperature;
    }

    public int getNumberOfPrograms() {
        return numberOfPrograms;
    }

    public void setNumberOfPrograms(int numberOfPrograms) {
        this.numberOfPrograms = numberOfPrograms;
    }

    public String getTypeOfOven() {
        return typeOfOven;
    }

    public void setTypeOfOven(String typeOfOven) {
        this.typeOfOven = typeOfOven;
    }

    public int getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(int maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }
}
