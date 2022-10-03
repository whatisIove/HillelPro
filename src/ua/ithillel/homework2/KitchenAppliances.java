package ua.ithillel.homework2;

public class KitchenAppliances {

    private String energyConsumptionClass;
    private boolean isItConnected;
    private Fridge fridge;
    private Oven oven;

    public KitchenAppliances() {
    }

    public KitchenAppliances(String energyConsumptionClass, boolean isItConnected, Fridge fridge) {
        this.energyConsumptionClass = energyConsumptionClass;
        this.isItConnected = isItConnected;
        this.fridge = fridge;
    }

    public KitchenAppliances(String energyConsumptionClass, boolean isIsConnected, Oven oven) {
        this.energyConsumptionClass = energyConsumptionClass;
        this.isItConnected = isIsConnected;
        this.oven = oven;
    }

    public String getEnergyConsumptionClass() {
        return energyConsumptionClass;
    }

    public void setEnergyConsumptionClass(String energyConsumptionClass) {
        this.energyConsumptionClass = energyConsumptionClass;
    }

    public boolean isIsConnected() {
        return isItConnected;
    }

    public void setIsConnected(boolean isConnected) {
        isItConnected = isConnected;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public void setFridge(Fridge fridge) {
        this.fridge = fridge;
    }

    public Oven getOven() {
        return oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }
}
