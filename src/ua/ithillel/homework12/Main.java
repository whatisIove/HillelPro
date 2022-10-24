package ua.ithillel.homework12;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Test", 20));
        list.add(new User("Vlad", 22));
        Util.rev(list);
        System.out.println(list);

        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        int add = Integer.parseInt("5");
        integerBox.inspect(add);

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean notSame = Util.compare(p1, p2);
        System.out.println(notSame);

        Pair<Integer, String> v2 = new Pair<>(2, "pear");
        boolean same = Util.compare(p2, v2);
        System.out.println(same);

    }
}
