package ua.ithillel.homework2;

public class Furniture {

    private String color;
    private double length;
    private double width;
    private int capacity;
    private Bed bed;
    private Sofa sofa;

    public Furniture(String color, double length, double width, int capacity, Bed bed) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.capacity = capacity;
        this.bed = bed;
    }

    public Furniture(String color, double length, double width, int capacity, Sofa sofa) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.capacity = capacity;
        this.sofa = sofa;
    }

    public Furniture() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

}
