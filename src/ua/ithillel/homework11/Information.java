package ua.ithillel.homework11;

import java.util.*;

public class Information {

    private ArrayList<String> userAliases;
    private HashSet<String> usersMail;
    private HashMap<String, String> mailsToAliases;

    public Information(ArrayList<String> userAliases, HashSet<String> usersMail,
                       HashMap<String, String> mailsToAliases) {
        this.userAliases = userAliases;
        this.usersMail = usersMail;
        this.mailsToAliases = mailsToAliases;
    }

    public ArrayList<String> getUserAliases() {
        return userAliases;
    }

    public void setUserAliases(ArrayList<String> userAliases) {
        this.userAliases = userAliases;
    }

    public HashSet<String> getUsersMail() {
        return usersMail;
    }

    public void setUsersMail(HashSet<String> usersMail) {
        this.usersMail = usersMail;
    }

    public HashMap<String, String> getMailsToAliases() {
        return mailsToAliases;
    }

    public void setMailsToAliases(HashMap<String, String> mailsToAliases) {
        this.mailsToAliases = mailsToAliases;
    }

    @Override
    public String toString() {
        return "Information Data: " + "\n" +
                "User Aliases = " + userAliases + "\n" +
                "Users Mail = " + usersMail + "\n" +
                "Mails To Aliases = " + mailsToAliases;
    }
}