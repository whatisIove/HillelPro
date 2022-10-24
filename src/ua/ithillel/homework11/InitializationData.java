package ua.ithillel.homework11;

import java.util.*;

public class InitializationData {

    /**
     * Статическая генерация рандомной почты и псевдонима пользователя.
     */
    private static final int desiredLength = 5;
    private static final String nameRandom = UUID.randomUUID()
            .toString()
            .substring(0, desiredLength);
    private static final String emailRandom = UUID.randomUUID()
            .toString()
            .substring(0, desiredLength);

    /**
     * Статическая инфа о юзере для десяти одинаковых полей в Information.
     */
    private static final String userAlias = "VLADISLAV";
    private static final String userMail = "vladislav@nmu.one";

    public static Information initializationInformation() {
        ArrayList<String> userAliases = new ArrayList<>();
        HashSet<String> usersMail = new HashSet<>();
        HashMap<String, String> mailsToAliases = new HashMap<>();
        Information information = new Information(userAliases, usersMail, mailsToAliases);

        for (int i = 0; i < 30; i++) {
            userAliases.add(i + "" + nameRandom);
            usersMail.add(i + "" + emailRandom + "@ukr.net");
            mailsToAliases.put(i + "" + nameRandom + "@ukr.net", i + "" + emailRandom);
        }

        for (int i = 0; i < 10; i++) {
            userAliases.add(userAlias);
            usersMail.add(userMail);
            mailsToAliases.put(userAlias, userMail);
        }

        if (!checkingTheNumberOfCellsInInformation(information)) {
            HashSet<String> userAliasesSet = new HashSet<>(userAliases);
            userAliases.clear();
            userAliases.addAll(userAliasesSet);
        }
        return information;
    }

    private static boolean checkingTheNumberOfCellsInInformation(Information information) {
        return information.getUserAliases().size() == information.getUsersMail().size()
                && information.getUsersMail().size() == information.getMailsToAliases().size();
    }
}