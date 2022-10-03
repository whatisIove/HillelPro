package ua.ithillel.homework8.service;

import ua.ithillel.homework8.entity.Client;
import ua.ithillel.homework8.util.ValidationHelper;

public class TransactionService {

    public void transferOfMoney(Client client, String accountId) {
        ValidationHelper validationHelper = new ValidationHelper();
        validationHelper.verificationTransactionsBetweenClients(client.getAccountId(), accountId);
    }
}
