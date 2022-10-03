package ua.ithillel.homework8.exception;

import java.io.IOException;

public class WrongFieldException extends IOException {
    public WrongFieldException() {
        super("WrongFieldException\nAccount ID must be ten characters long!!!");
    }
}
