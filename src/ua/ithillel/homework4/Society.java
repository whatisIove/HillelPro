package ua.ithillel.homework4;

abstract public class Society extends University implements ActionSociety {

    private final static int NUMBER_OF_STUDENTS = 9843;
    private final static int NUMBER_OF_TEACHERS = 112;

    private String name;
    private int year;
    private char gender;

    public Society() {
    }

    public Society(String name, int year, char gender) {
        this.name = name;
        this.year = year;
        this.gender = gender;
    }

    public void infoAboutPerson() {
        System.out.println("Default: student or teacher, redefine.");
    }

    public static void infoAboutSociety() {
        System.out.println("\nStudents value: " + NUMBER_OF_STUDENTS +
                "\nNumber of teaching staff: " + NUMBER_OF_TEACHERS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
