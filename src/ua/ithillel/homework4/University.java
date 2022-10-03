package ua.ithillel.homework4;


abstract public class University implements UniversityInfo {

    private final static String NAME_OF_THE_UNIVERSITY = "Dnipro Polytechnic";
    private final static int YEAR_OF_FOUNDATION = 1899;
    private final static String ADDRESS = "Ukraine, Dnipro, Olesya Gonchara street, 4A";

    public University() {
    }

    public static void requestInformationAboutTheUniversity() {
        System.out.println("Name of the University: " + NAME_OF_THE_UNIVERSITY + "\nYear of foundation: " +
                YEAR_OF_FOUNDATION + "\nAddress: " + ADDRESS);
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfTheUniversity='" + NAME_OF_THE_UNIVERSITY + '\'' +
                ", yearOfFoundation=" + YEAR_OF_FOUNDATION +
                ", address='" + ADDRESS + '\'' +
                '}';
    }
}
