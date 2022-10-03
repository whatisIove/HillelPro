package ua.ithillel.homework2;

public class Sofa extends Furniture{

    private String sofaType;
    private boolean doesItUnfold;

    public Sofa(String sofaType, boolean doesItUnfold) {
        this.sofaType = sofaType;
        this.doesItUnfold = doesItUnfold;
    }

    public String getSofaType() {
        return sofaType;
    }

    public void setSofaType(String sofaType) {
        this.sofaType = sofaType;
    }

    public boolean isDoesItUnfold() {
        return doesItUnfold;
    }

    public void setDoesItUnfold(boolean doesItUnfold) {
        this.doesItUnfold = doesItUnfold;
    }
}
