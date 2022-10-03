package ua.ithillel.homework4;

final public class Student extends Society implements Tasks {

    private String specialty;
    private String group;
    private int serialNumberOffset;

    public Student(String name, int year, char gender, String specialty, String group, int serialNumberOffset) {
        super(name, year, gender);
        this.specialty = specialty;
        this.group = group;
        this.serialNumberOffset = serialNumberOffset;
    }

    @Override
    public void infoAboutPerson() {
        String info = "\nName, surname: " + super.getName() + "\nYear: " + super.getYear() + "\nGender: " +
                super.getGender() + "\nSpecialty: " + getSpecialty() + "\nGroup: " + getGroup() +
                "\nSerial number offset: " + getSerialNumberOffset();
        System.out.println(info);

    }

    public void dedicationToStudents() {
        String enter = "\nName, surname: " + super.getName() + " entered the university for the specialty: "
                + getSpecialty() + ".";
        System.out.println(enter);
    }

    @Override
    public void setTask() {
        System.out.println("Get homework...");
    }

    @Override
    public void completeTheTask() {
        System.out.println("Complete and submit homework...");
    }

    @Override
    public void findMoreInformationByCall(int number) {
        System.out.println("Call for correction of information...");
    }

    @Override
    public void findMoreInformationByMail(String email) {
        System.out.println("Email to correction information...");
    }

    @Override
    public void graduation() {
        System.out.println("Getting a diploma...");
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getSerialNumberOffset() {
        return serialNumberOffset;
    }

    public void setSerialNumberOffset(int serialNumberOffset) {
        this.serialNumberOffset = serialNumberOffset;
    }

}
