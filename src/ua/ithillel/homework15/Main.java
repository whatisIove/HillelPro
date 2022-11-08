package ua.ithillel.homework15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class Main {
    public static void main(String[] args) {

        final Stream<String> empty = Stream.empty();
        System.out.println(empty.skip(0)
                .mapToDouble(Double::parseDouble)
                .count());

        final List<User> users = Arrays.asList(new User(23, "Vlad"),
                new User(33, "admin"), new User(43, "test"),
                new User(53, "user"), new User(23, "Vlad"));

        final Set<User> setUser = users.stream().distinct()
                .limit(4).collect(toSet());
        setUser.forEach(System.out::println);

        final ArrayList<Integer> list = new ArrayList<>();
        List<Integer> result = generationNumberWithShuffle(list).stream().toList();
        result.forEach(System.out::println);

        final HashMap<Integer, User> hashMap = new HashMap<>();
        fillingInformation(users, hashMap);
        final List<User> userList = hashMap.values().stream()
                .peek(System.out::println).toList();

        final List<String> listNumbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        listNumbers.stream().skip(1).limit(8).mapToInt(Integer::parseInt)
                .filter((value) -> (value) % 2 == 0).distinct()
                .forEach(System.out::println);

        final Stream<Character> characterStream = Stream.of('A', 'B', 'C', 'X', 'Y', 'Z');
        final Optional<Character> optionalCharacter = characterStream.parallel()
                .sorted()
                .filter(character -> character != 'A')
                .limit(4)
                .skip(2)
                .findFirst();
        System.out.println(optionalCharacter);

        final Calendar cal = Calendar.getInstance();
        final Date date = new Date();
        System.out.println("Date = " + date);
        cal.setTime(date);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("year", cal.get(Calendar.YEAR));
        linkedHashMap.put("month", cal.get(Calendar.MONTH));
        linkedHashMap.put("day", cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("HashMap (Date) = " + linkedHashMap);
        linkedHashMap.put("hour", cal.get(Calendar.HOUR_OF_DAY));
        linkedHashMap.put("minute", cal.get(Calendar.MINUTE));
        linkedHashMap.put("second", cal.get(Calendar.SECOND));
        linkedHashMap.put("millisecond", cal.get(Calendar.MILLISECOND));
        System.out.println("HashMap (DateTime) = " + linkedHashMap);

        List<String> stringList = linkedHashMap.entrySet().stream()
                .map(String::valueOf)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));
        stringList.forEach(System.out::println);

    }

    private static ArrayList<Integer> generationNumberWithShuffle(ArrayList<Integer> list) {
        for (int i = 1; i < 3; i++) list.add(i);
        Collections.shuffle(list);
        return list;
    }

    private static void fillingInformation(List<User> users, HashMap<Integer, User> hashMap) {
        for (int i = 0; i < 2; i++) {
            hashMap.put(i + 1, users.get(i));
        }
    }
}