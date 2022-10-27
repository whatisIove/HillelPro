package ua.ithillel.homework13.interfaces;

import java.util.Scanner;

public interface ViberService {

    Scanner scanner = new Scanner(System.in);

    default void login(String login) {
        System.out.println("Authorization...");
    }

    static void addUser() {
        boolean isNumberCorrect = true;
        System.out.println("Enter user phone: ");
        String numberPhone = scanner.next();
        System.out.println("Enter username: ");
        String username = scanner.next();
        while (isNumberCorrect) {
            if (numberPhone.length() == 10) {
                System.out.println("Is added " + numberPhone + " to contact with name " + username);
                break;
            }
            isNumberCorrect = false;
            System.err.println("Incorrect phone number.");
            addUser();
        }
    }

    void readMessage();

    void deleteMessage();
}
