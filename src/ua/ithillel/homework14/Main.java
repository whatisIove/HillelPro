package ua.ithillel.homework14;

import java.time.LocalDateTime;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Predicate<Double> predicate = doubleSalary -> doubleSalary >= 1500.0;
        System.out.println("predicate.test(1499.99): " + predicate.test(1499.99));
        System.out.println("predicate.test(1500.00): " + predicate.test(1500.00));

        Consumer<String> consumer = (valueString) -> convertStringToChar(valueString.toCharArray());
        consumer.accept("MoNdAy");

        Function<Integer, String> function = (valueInteger) -> integerToString(valueInteger);
        System.out.println("\nfunction.apply(1) : " + function.apply(1));
        System.out.println("function.apply(11) : " + function.apply(11));

        Supplier<String> supplier = () -> String.valueOf(LocalDateTime.now());
        System.out.println(supplier.get());

        BiFunction<Integer, Double, String> biFunction =
                (valueInteger, valueDouble) -> subtractTwoNumbers(valueInteger, valueDouble);
        String applyResult = biFunction.apply(2, 1.01);
        String result = biFunction.apply(2, 1.00);
        System.out.println("applyResult is: " + applyResult);
        System.out.println("applyResult is: " + result);

        FiveDigitFunction<Integer, Long, Float, Double, String> fiveDigitFunction =
                (valueInteger, valueLong, valueFloat, valueDouble) ->
                        fiveDigitFunctionResult(valueInteger, valueLong, valueFloat, valueDouble);
        System.out.println("is the result of the two operations equal? " +
                fiveDigitFunction.fiveDigitFunction(1, 2L, 3F, 4.4));
        System.out.println("is the result of the two operations equal? " +
                fiveDigitFunction.fiveDigitFunction(10, 20L, 5F, 5.0));

        IntToLongFunction intToLongFunction = (intValue) -> 10L * intValue;
        System.out.println("IntToLongFunction: " + intToLongFunction.applyAsLong(2));
    }

    private static String fiveDigitFunctionResult(Integer valueInteger, Long valueLong, Float valueFloat,
                                                  Double valueDouble) {
        return (valueInteger + valueDouble) == (valueLong - valueFloat) ? "YES" : "NO";
    }

    private static String subtractTwoNumbers(Integer valueInteger, Double valueDouble) {
        return valueInteger - valueDouble < 1 ?
                "remainder less than one." :
                Double.toString(valueInteger - valueDouble);
    }

    private static String integerToString(Integer value) {
        String[] values = new String[]{"one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten"};
        return value > 0 && value < 11 ? values[value - 1] : "unknown";
    }

    private static void convertStringToChar(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}