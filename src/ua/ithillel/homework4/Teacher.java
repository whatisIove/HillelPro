package ua.ithillel.homework4;


final public class Teacher extends Society implements Tasks {

    private String scientificDegree;
    private boolean doesHeSuperviseTheGroup;

    public Teacher() {
    }

    public Teacher(String name, int year, char gender, String scientificDegree, boolean doesHeSuperviseTheGroup) {
        super(name, year, gender);
        this.scientificDegree = scientificDegree;
        this.doesHeSuperviseTheGroup = doesHeSuperviseTheGroup;
    }

    @Override
    public void infoAboutPerson() {
        String info = "\nName, surname: " + super.getName() + "\nYear: " + super.getYear() + "\nGender: " +
                super.getGender() + "\nScientific degree: " + scientificDegree +
                "\nIs there a group behind him? " + doesHeSuperviseTheGroup;
        System.out.println(info);
    }

    public void comeToWork() {
        String come = "\nName, surname: " + super.getName() + "came to work";
        System.out.println(come);
    }

    @Override
    public void setTask() {
        System.out.println("Give out homework...");
    }

    @Override
    public void completeTheTask() {
        System.out.println("Check all homework...");
    }

    @Override
    public void dedicationToStudents() {
        System.out.println("The curation of the group has begun...");
    }

    @Override
    public void graduation() {
        System.out.println("Its ending...");
    }

    public String getScientificDegree() {
        return scientificDegree;
    }

    public void setScientificDegree(String scientificDegree) {
        this.scientificDegree = scientificDegree;
    }

    public boolean isDoesHeSuperviseTheGroup() {
        return doesHeSuperviseTheGroup;
    }

    public void setDoesHeSuperviseTheGroup(boolean doesHeSuperviseTheGroup) {
        this.doesHeSuperviseTheGroup = doesHeSuperviseTheGroup;
    }

    @Override
    public void findMoreInformationByCall(int number) {
        System.out.println("Call to the dean's office to correction the information...");
    }

    @Override
    public void findMoreInformationByMail(String email) {
        System.out.println("Email to the dean's office to correction the information...");
    }
}
