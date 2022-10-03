package ua.ithillel.homework2;

public class House {

    private double theAreaOfTheHouse;
    private int numberOfFloors;
    private int numberOfRooms;
    private Furniture[] furniture;
    private KitchenAppliances[] kitchenAppliances;

    public House(double theAreaOfTheHouse, int numberOfFloors, int numberOfRooms, Furniture[] furniture,
                 KitchenAppliances[] kitchenAppliances) {
        this.theAreaOfTheHouse = theAreaOfTheHouse;
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.furniture = furniture;
        this.kitchenAppliances = kitchenAppliances;

        System.out.println("\nArea of the house: " + this.theAreaOfTheHouse + "\nNumber of floors: " +
                this.numberOfFloors + "\nNumber of rooms: " + this.numberOfRooms + "\nFurniture in " +
                "the house: " + this.furniture.length + "\nHousehold appliances in the house: " +
                this.kitchenAppliances.length);
    }

    public double getTheAreaOfTheHouse() {
        return theAreaOfTheHouse;
    }

    public void setTheAreaOfTheHouse(double theAreaOfTheHouse) {
        this.theAreaOfTheHouse = theAreaOfTheHouse;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Furniture[] getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture[] furniture) {
        this.furniture = furniture;
    }

    public KitchenAppliances[] getKitchenAppliances() {
        return kitchenAppliances;
    }

    public void setKitchenAppliances(KitchenAppliances[] kitchenAppliances) {
        this.kitchenAppliances = kitchenAppliances;
    }
}
