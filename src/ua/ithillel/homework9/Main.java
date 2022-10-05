package ua.ithillel.homework9;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = "The deeper your understanding of the world,\n" +
                "The fewer idols remain in you.\n" +
                "But it is worth remembering that every idol\n" +
                "He helped you to comprehend this world.";

        TextHelper.fileWrite(text);
        TextHelper.fileCheck(text);
        TextHelper.fileRead();

        User user = new User();
        user.registration();
        user.login();

    }
}

