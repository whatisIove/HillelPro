package ua.ithillel.homework8.util;

import ua.ithillel.homework8.exception.UserExpectedError;
import ua.ithillel.homework8.exception.WrongFieldException;
import ua.ithillel.homework8.exception.WrongSumException;

public class ValidationHelper {

    public void checkAccountIdLength(String accountId) throws WrongFieldException {
        if (accountId.length() != 10) {
            throw new WrongFieldException();
        }
    }

    public void checkSum(Double sum) throws WrongSumException {
        if (sum > 1000) {
            throw new WrongSumException();
        }
    }

    public void verificationTransactionsBetweenClients(String senderAccountId, String recipientAccountId) {
        if (senderAccountId.equals(recipientAccountId)) {
            throw new UserExpectedError();
        }
    }
}
