package ua.ithillel.homework9;

import java.io.*;
import java.util.Scanner;

public class User {

    private String login;
    private String password;
    private final static int MAX_PASS_ATTEMPTS = 3;
    private int passAttempts = 0;
    private boolean isLoggedIn = false;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String filePath = "resources/users.txt";

    public User() {
    }

    public void registration() throws IOException {
        System.out.println("Enter your username: ");
        String login = scanner.next();
        setLogin(login);
        System.out.println("Enter your password: ");
        String password = scanner.next();
        setPassword(password);
        System.out.println("Enter your password again: ");
        String passwordAgain = scanner.next();
        if (password.equalsIgnoreCase(passwordAgain)) {
            FileWriter fileWriter = new FileWriter(filePath, true);
            fileWriter.write(getLogin() + " " + getPassword());
            System.out.println("Successful user registered!");
            fileWriter.close();
        } else
            System.err.println("Maybe your passwords don't match!!!");
    }

    public void login() throws IOException {
        FileReader fileReader = new FileReader(filePath);
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()) {
            String string = sc.nextLine();
            while (passAttempts < MAX_PASS_ATTEMPTS && !isLoggedIn) {
                System.out.println("Enter your username: ");
                String login = scanner.next();
                System.out.println("Enter your password: ");
                String password = scanner.next();
                String sign = login.concat(" " + password);
                if (!(sign.equals(string))) {
                    System.err.println("\nUser with such username or password was not found!\n");
                    passAttempts++;
                } else {
                    System.out.println("Welcome " + login + "!");
                    isLoggedIn = true;
                    break;
                }
            }
        }
        sc.close();
        fileReader.close();
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
