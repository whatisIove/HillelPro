package ua.ithillel.homework3;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        User user = new User();
        Support support = new Support();
        Admin admin = new Admin();

        user.write();

        System.out.println("User login.");
        login(user);

        System.out.println("Support login.");
        login(support);

        System.out.println("Admin login.");
        login(admin);

        sc.close();
    }

    private static void login(User user) {

        if (user instanceof Support) {
            ((Support) user).textCheck(((Support) user).checkInfo());
        } else if (user instanceof Admin) {
            ((Admin) user).texDel(((Admin) user).textCheck(((Admin) user).checkInfo()));
        } else if (user instanceof User) {
            user.read();
        }
    }
}