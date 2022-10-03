package ua.ithillel.homework3;

import java.util.Scanner;

import static ua.ithillel.lesson3.Main.sc;

public class Admin extends User {
    public Admin() {
    }

    public Admin(String name, String surname, String email, String password, String gender, String country) {
        super(name, surname, email, password, gender, country);
    }

    public String checkInfo() {
        System.out.println("Text for checking: ");
        String str = sc.nextLine();
        return str;
    }

    public boolean textCheck(String str) {
        Scanner scanInfo = new Scanner(sc.nextLine());
        while (scanInfo.hasNextLine()) {
            String checkStr = scanInfo.nextLine();
            if (checkStr.equalsIgnoreCase(str)) {
                System.out.println("Lines have the same text: " + str + "\nInput new text:");
                return true;
            }
        }
        scanInfo.close();
        System.out.println("Missing text in a line: " + str);
        return false;
    }

    public String texDel(Boolean textCheck) {
        if (textCheck) {
            Scanner texDel = new Scanner(sc.nextLine());
            while (texDel.hasNextLine()) {
                String checkStr = texDel.nextLine();
                if (checkStr.equalsIgnoreCase(checkInfo())) {
                    checkStr = null;
                    System.out.println("Lines are the same, text removed." + "\nLine: " + checkStr);
                    return "Lines are the same, text removed." + "\nLine: " + checkStr;
                }
            }
        }
        System.out.println("Lines are not the same, deletion is not possible.");
        return "Lines are not the same, deletion is not possible.";
    }
}

