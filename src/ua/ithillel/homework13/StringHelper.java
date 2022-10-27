package ua.ithillel.homework13;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {

    public Optional emailValidation(String email) {

        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (email.isEmpty() || !matcher.matches()) {
            return Optional.empty();
        }
        return Optional.of(email);
    }
}
