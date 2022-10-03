package ua.ithillel.homework4;

import java.util.Arrays;

public interface UniversityInfo extends Contacts {

    default void showSpecialties() {
        String[] specialties = new String[]{"Computer science - 1000$ per year",
                "Philology - 800 per year"};
        System.out.println(Arrays.toString(specialties));
    }

    default void formOfEducation() {
        String[] formEducation = new String[]{"Full-time", "Part-time", "Remote"};
        System.out.println(Arrays.toString(formEducation));
    }

    @Override
    void findMoreInformationByCall(int number);

    @Override
    void findMoreInformationByMail(String email);
}
