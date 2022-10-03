package ua.ithillel.homework4;

final public class Dean extends Society implements Tasks {

    private int workExperience;
    boolean isItAtTheWorkplace;

    public Dean() {
    }

    public Dean(String name, int year, char gender, int workExperience, boolean isItAtTheWorkplace) {
        super(name, year, gender);
        this.workExperience = workExperience;
        this.isItAtTheWorkplace = isItAtTheWorkplace;
    }

    @Override
    public void infoAboutPerson() {
        String info = "\nName, surname: " + super.getName() + "\nYear: " + super.getYear() + "\nGender: " +
                super.getGender() + "\nWork experience: " + workExperience + "\nAt work? " + isItAtTheWorkplace;
        System.out.println(info);
    }

    public void assignmentOfTasks(Teacher teacher, Student student) {
        if (isItAtTheWorkplace) {
            student.setGroup("CS-77");
            System.out.println("\nThe student " + student.getName() + " is assigned a group " + student.getGroup());
            teacher.setDoesHeSuperviseTheGroup(true);
            System.out.println("\nThe teacher " + teacher.getName() +
                    " oversees now oversees the group " + student.getGroup());

        } else {
            System.out.println("\nName, surname: " + super.getName() + "not at work.");
        }
    }

    @Override
    public void findMoreInformationByCall(int number) {
        System.out.println("Correction of collective information by phone...");
    }

    @Override
    public void findMoreInformationByMail(String email) {
        System.out.println("Correction of collective information by email...");
    }

    @Override
    public void setTask() {
        System.out.println("Make a schedule...");
    }

    @Override
    public void completeTheTask() {
        System.out.println("Mailing schedules to everyone...");
    }

    @Override
    public void dedicationToStudents() {
        System.out.println("Enrollment of students...");
    }

    @Override
    public void graduation() {
        System.out.println("Issuance of diplomas...");
    }
}

