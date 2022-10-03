package ua.ithillel.homework4;

public class Main {
    public static void main(String[] args) {

        University.requestInformationAboutTheUniversity();
        Society.infoAboutSociety();

        Dean dean = new Dean("Sarah Stevens", 45, 'F', 20, true);

        Teacher teacher = new Teacher("Bob Anderson", 54, 'M', "Professor",
                false);

        Student student = new Student("William Davidson", 20, 'M', "Computer science",
                null, 204256);

        student.dedicationToStudents();
        student.infoAboutPerson();
        student.findMoreInformationByCall(586744);
        student.findMoreInformationByMail("Test ask..");
        student.showSpecialties();
        student.formOfEducation();
        student.setTask();
        student.completeTheTask();
        student.beAbsent(student);
        student.graduation();

        teacher.comeToWork();
        teacher.infoAboutPerson();
        teacher.setTask();
        teacher.completeTheTask();
        teacher.bePresent(teacher);
        teacher.dedicationToStudents();
        teacher.graduation();

        dean.infoAboutPerson();
        dean.assignmentOfTasks(teacher, student);
        dean.setTask();
        dean.completeTheTask();
        dean.dedicationToStudents();
        dean.graduation();

    }
}