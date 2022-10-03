package ua.ithillel.homework4;

public interface ActionSociety extends Events {

    default void bePresent(Society society) {
        System.out.println("Name, surname: " + society.getName() + " present from the lecture.");
    }

    default void beAbsent(Society society) {
        System.out.println("Name, surname: " + society.getName() + " absent from the lecture.");
    }

    @Override
    void dedicationToStudents();

    @Override
    void graduation();
}
