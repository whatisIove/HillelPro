package ua.ithillel.homework11;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Information information = InitializationData.initializationInformation();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(77);
        integerList.add(777);

        Information dataProcessing = dataProcessing(integerList, information);

        String info = "Number of aliases: " + dataProcessing.getUserAliases().size() +
                " , number of mailboxes: " + dataProcessing.getUsersMail().size() +
                " , mail with users: " + dataProcessing.getMailsToAliases().size();
        System.out.println("\n" + info);
    }

    private static Information dataProcessing(List<? extends Number> numbers, Information information) {
        ArrayList<String> userAliases = information.getUserAliases();
        HashSet<String> usersMail = information.getUsersMail();
        HashMap<String, String> mailsToAliases = information.getMailsToAliases();

        for (Number number : numbers) {
            String name = String.valueOf(number);
            String email = name + "@mail.ua";

            userAliases.add(name);
            usersMail.add(email);

            if (!mailsToAliases.containsKey(email)) {
                mailsToAliases.put(email, name);
            }
        }
        System.out.println(information);
        return information;
    }
}