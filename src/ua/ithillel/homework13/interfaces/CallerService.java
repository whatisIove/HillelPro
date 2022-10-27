package ua.ithillel.homework13.interfaces;

import java.util.Scanner;

public interface CallerService {

    Scanner scanner = new Scanner(System.in);
    boolean hasAnswerPhone = true;

    default void login() {
        boolean isNumberCorrect = true;
        System.out.println("Registering a phone number on the network: ");
        String phoneNumber = scanner.next();
        while (isNumberCorrect) {
            if (phoneNumber.length() == 10) {
                System.out.println("Successful, your number is " + phoneNumber);
                break;
            }
            isNumberCorrect = false;
            System.err.println("Wrong phone number.");
            login();
        }
    }

    static void autoAnswer() {
        if (hasAnswerPhone) {
            System.out.println("Autoresponder enabled, leave your message.");
        } else System.out.println("Please call back later.");
    }

    public void call();

    public void dropTheCall();
}
