package ua.ithillel.homework31.exception.client;

import java.io.IOException;

public class WrongClientInfo extends IOException {
    public WrongClientInfo(final String message) {
        super(message);
    }
}