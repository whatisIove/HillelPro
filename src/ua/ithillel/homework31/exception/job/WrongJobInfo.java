package ua.ithillel.homework31.exception.job;

import java.io.IOException;

public class WrongJobInfo extends IOException {
    public WrongJobInfo(final String message) {
        super(message);
    }
}
