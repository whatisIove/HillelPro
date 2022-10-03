package ua.ithillel.homework8.exception;

public class UserExpectedError extends RuntimeException {

    public UserExpectedError() {
        super("UserExpectedError\nYou cannot transfer to the same account!!!");
    }
}
