package ua.ithillel.homework8.exception;

import java.io.IOException;

public class WrongSumException extends IOException {
    public WrongSumException() {
        super("WrongSumException\nTransfer amount should not exceed one thousand dollars!!!");
    }
}
