package ua.ithillel.homework7;

public class StringHelper {

    public String stringHelper(String string, char[] charsArr) {
        if (charsArr == null) {
            System.out.println("Character array is empty.");
        }
        String secondString = String.valueOf(charsArr);
        if (string.strip().isBlank() || secondString.strip().isBlank()) {
            System.out.println("One of strings is empty.");
        }
        string = string.toUpperCase();
        secondString = secondString.toLowerCase();

        string = string.strip();
        secondString = secondString.strip();

        secondString = string.concat(" ".concat(secondString));

        if (secondString.length() % 2 == 0) {
            secondString = secondString.substring(secondString.length() / 2 - 1,
                    secondString.length() / 2 + 1);
        } else {
            secondString = secondString.substring(secondString.length() / 2,
                    secondString.length() / 2 + 1);
        }
        return secondString;
    }
}
