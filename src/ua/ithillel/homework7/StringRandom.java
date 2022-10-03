package ua.ithillel.homework7;

import java.util.Random;

public class StringRandom {

    private static final char[] options = {'A', 'b', 'D', 'E', 'F', 'Z', 'P', 'E', 'N', 'T', 'L', 'C',
            'R', 't', 'Y', 'O', 'M', 'v', 'w', 'x', 'Z', 'D', ' ', '@', '\r', '\t', '\n'};

    public static char[] createRandomArr() {
        Random random = new Random();

        char[] arr = new char[70];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = options[random.nextInt(options.length)];
        }
        arr.toString();
        return arr;
    }
}
