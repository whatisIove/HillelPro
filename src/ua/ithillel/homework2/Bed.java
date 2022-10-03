package ua.ithillel.homework2;

public class Bed extends Furniture {

    private String bedType;
    private boolean isItCovered;

    public Bed(String bedType, boolean isItCovered) {
        this.bedType = bedType;
        this.isItCovered = isItCovered;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public boolean isItCovered() {
        return isItCovered;
    }

    public void setItCovered(boolean itCovered) {
        isItCovered = itCovered;
    }
}
