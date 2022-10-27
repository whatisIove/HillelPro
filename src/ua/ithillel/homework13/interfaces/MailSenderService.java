package ua.ithillel.homework13.interfaces;

import java.util.Scanner;

public interface MailSenderService {
    Scanner scanner = new Scanner(System.in);
    boolean possibilityOfEntry = true;

    default void login(String email) {

        if (possibilityOfEntry) {
            System.out.println("Welcome to the mailbox " + email);
        } else {
            System.out.println("The email you entered does not match.");
        }
    }

    static void chooseLetterRecipient() {
        String info = "1 - test@gmail.com \t 2 - test@mail.ua \t 3 - test@ukr.net \n Choose email for send message:";
        System.out.println(info);
        switch (scanner.nextInt()) {
            case 1 -> System.out.println("test@gmail.com");
            case 2 -> System.out.println("test@mail.ua");
            case 3 -> System.out.println("test@ukr.net");
            default -> {
                System.out.println("Choose from 1 to 3.");
                chooseLetterRecipient();
            }
        }
    }

    String createMail(String mail);

    void sendMail();

}
