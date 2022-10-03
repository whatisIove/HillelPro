package ua.ithillel.homework2;

public class Fridge extends KitchenAppliances {

    private int numberOfCompartments;
    private String defrostingSystem;
    private int minimumTemperature;

    public Fridge(int numberOfCompartments, String defrostingSystem, int minimumTemperature) {
        this.numberOfCompartments = numberOfCompartments;
        this.defrostingSystem = defrostingSystem;
        this.minimumTemperature = minimumTemperature;
    }

    public int getNumberOfCompartments() {
        return numberOfCompartments;
    }

    public void setNumberOfCompartments(int numberOfCompartments) {
        this.numberOfCompartments = numberOfCompartments;
    }

    public String getDefrostingSystem() {
        return defrostingSystem;
    }

    public void setDefrostingSystem(String defrostingSystem) {
        this.defrostingSystem = defrostingSystem;
    }

    public int getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(int minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }
}
