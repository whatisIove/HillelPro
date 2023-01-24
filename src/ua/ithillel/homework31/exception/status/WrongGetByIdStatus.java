package ua.ithillel.homework31.exception.status;

import java.io.IOException;

public class WrongGetByIdStatus extends IOException {
    public WrongGetByIdStatus(final String message) {
        super(message);
    }
}
