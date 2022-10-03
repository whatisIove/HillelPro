package ua.ithillel.homework7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StringHelper stringHelper = new StringHelper();
        char[] charsArr = {'O', 'b', 'j', 'e', 'c', 't', ' ', 'o', 'r', 'i', 'e', 'n', 't', 'e', 'd'};
        System.out.println("Strings before all changes: " + Arrays.toString(charsArr));
        System.out.println("Result: " + "\"" + stringHelper.stringHelper("str", charsArr) + "\"");

        ValidationCheck validationCheck = new ValidationCheck();

        String correctPhoneNumber = "+380978575524";
        validationCheck.numberValidation(correctPhoneNumber);
        String incorrectPhoneNumber = "+447800767690";
        validationCheck.numberValidation(incorrectPhoneNumber);

        String emailCorrect = "whatislove@ukr.net";
        String emailIncorrect = "T6#$sw@google";
        validationCheck.emailValidation(emailCorrect);
        validationCheck.emailValidation(emailIncorrect);

        String birthdayCorrect = "2022-09-27";
        validationCheck.birthdayDateValidation(birthdayCorrect);
        String birthdayIncorrect = "2023-01-01";
        validationCheck.birthdayDateValidation(birthdayIncorrect);

        /**
         * string helper test with random elements in chars
         */
        StringHelper stringHelperWithRandom = new StringHelper();
        char[] charsArray = StringRandom.createRandomArr();
        System.out.println("\n" + "Strings before all changes: " + Arrays.toString(charsArray));
        System.out.println("Result: " + "\"" + stringHelperWithRandom.
                stringHelper("str", charsArray) + "\"");

    }
}
