package ua.ithillel.homework2;

public class ParameterFinal {

    private final String carBrand;
    private final int yearOfRelease;
    private final int quantity;

    // конечные переменные должны быть определены в конструкторе при инициализации или сразу же в переменных.
//    public ua.ithillel.java.ParameterFinal() {
//    }

    public ParameterFinal(String carBrand, int yearOfRelease, int quantity) {
        this.carBrand = carBrand;
        this.yearOfRelease = yearOfRelease;
        this.quantity = quantity;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getQuantity() {
        return quantity;
    }

    // поскольку значение конечной переменной не может быть изменено, сеттер не используется.
//    public void setCarBrand(String carBrand) {
//        this.carBrand = carBrand;
//    }
//
//    public void setYearOfRelease(int yearOfRelease) {
//        this.yearOfRelease = yearOfRelease;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
}
