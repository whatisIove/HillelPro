package ua.ithillel.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Furniture bed = new Furniture("White", 200, 100, 2,
                new Bed("Children", false));

        Furniture sofa = new Furniture("Yellow", 70, 170, 4,
                new Sofa("Corner with ottoman", true));

        Furniture[] furniture = {bed, sofa};

        KitchenAppliances fridge = new KitchenAppliances("A++", true,
                new Fridge(4, "NON-FROST", -30));
        KitchenAppliances oven = new KitchenAppliances("A++", false,
                new Oven(10, "Electrical", 200));

        KitchenAppliances[] kitchenAppliances = {fridge, oven};

        House house = new House(229.50, 2, 5, furniture,
                kitchenAppliances);

        String infoBed = "\nInfo Bed:\nColor: " + bed.getColor() + "\nLength: " + bed.getLength() +
                "\nWidth: " + bed.getWidth() + "\nCapacity: " + bed.getCapacity() + "\nBed Type: " +
                bed.getBed().getBedType() + "\nIs it covered: " + bed.getBed().isItCovered();
        System.out.println(infoBed);

        String infoSofa = "\nInfo Sofa:\nColor: " + sofa.getColor() + "\nLength: " + sofa.getLength() +
                "\nWidth: " + sofa.getWidth() + "\nCapacity: " + sofa.getCapacity() + "\nSofa Type: " +
                sofa.getSofa().getSofaType() + "\nIs does it unfold: " + sofa.getSofa().isDoesItUnfold();
        System.out.println(infoSofa);

        String infoFridge = "\nEnergy consumption class: " + fridge.getEnergyConsumptionClass()
                + "\nIs it connected: " + fridge.getFridge().isIsConnected() + "\nNumber of compartments: " +
                fridge.getFridge().getNumberOfCompartments() + "\nDefrosting system: " +
                fridge.getFridge().getDefrostingSystem() + "\nMinimum temperature: " +
                fridge.getFridge().getMinimumTemperature();
        System.out.println(infoFridge);

        String infoOven = "\nEnergy consumption class: " + oven.getEnergyConsumptionClass() +
                "\nIs it connected: " + oven.getOven().isIsConnected() + "\nNumber of programs: "
                + oven.getOven().getNumberOfPrograms() + "\nType of oven: " +
                oven.getOven().getTypeOfOven() + "\nMaximum temperature: " + oven.getOven().getMaximumTemperature();
        System.out.println(infoOven);

        String test = "Test " + Arrays.deepToString(furniture);
        System.out.println(test);

    }
}
