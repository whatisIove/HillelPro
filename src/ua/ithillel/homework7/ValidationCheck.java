package ua.ithillel.homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationCheck {

    public void numberValidation(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(\\+380)[0-9]{9}$");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("Phone number is correct: " + phoneNumber);
        } else {
            System.out.println("Phone number is incorrect: " + phoneNumber);
        }
    }

    public void emailValidation(String email) {

        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email address is correct: " + email);
        } else {
            System.out.println("Email address is incorrect: " + email);
        }
    }

    /**
     * @param birthdayDate check for validity in the interval from the beginning of 1900 to the end of 2022
     */
    public void birthdayDateValidation(String birthdayDate) {
        Pattern pattern = Pattern.compile("^((19|2[0])[0-2]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$");
        Matcher matcher = pattern.matcher(birthdayDate);
        if (matcher.matches()) {
            System.out.println("Date of birth possible: " + birthdayDate);
        } else {
            System.out.println("Date of birth is not possible: " + birthdayDate);
        }
    }
}
