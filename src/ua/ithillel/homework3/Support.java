package ua.ithillel.homework3;

import java.util.Scanner;

public class Support extends User {
    public Support() {
    }

    public Support(String name, String surname, String email, String password, String gender, String country) {
        super(name, surname, email, password, gender, country);
    }

    public String checkInfo() {
        System.out.println("Text for checking: ");
        return Main.sc.nextLine();
    }

    public boolean textCheck(String str) {
        Scanner scanInfo = new Scanner(Main.sc.nextLine());
        while (scanInfo.hasNextLine()) {
            String checkStr = scanInfo.nextLine();
            if (checkStr.equalsIgnoreCase(str)) {
                System.out.println("The same text: " + str);
                return true;
            }
        }
        scanInfo.close();
        System.out.println("Missing text: " + str);
        return false;
    }
}
