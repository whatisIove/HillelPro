package ua.ithillel.homework13.interfaces;

import java.util.Scanner;

public interface TelegramService {

    Scanner scanner = new Scanner(System.in);
    String usernameLogin = "whatislove";
    String usernamePassword = "1234qw";

    default void login() {
        boolean isLoggedIn = true;

        System.out.println("Enter your username: ");
        String login = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        while (isLoggedIn) {
            if (login.equalsIgnoreCase(usernameLogin) && password.equalsIgnoreCase(usernamePassword)) {
                System.out.println("Hello to the telegram, " + login);
                break;
            }
            isLoggedIn = false;
            System.err.println("Incorrect username or password.");
            login();
        }
    }

    static void runApp() {
        System.out.println("Open telegram app.");
    }

    void videoCall();

    void createGroup();

}
