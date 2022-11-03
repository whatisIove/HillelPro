package ua.ithillel.homework14;

@FunctionalInterface
public interface FiveDigitFunction<T, U, R, Q, E> {
    E fiveDigitFunction(T t, U u, R r, Q q);
}