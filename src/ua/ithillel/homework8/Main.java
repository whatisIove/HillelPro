package ua.ithillel.homework8;

import ua.ithillel.homework8.entity.Client;
import ua.ithillel.homework8.exception.WrongFieldException;
import ua.ithillel.homework8.exception.WrongSumException;
import ua.ithillel.homework8.service.TransactionService;
import ua.ithillel.homework8.util.ValidationHelper;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ValidationHelper validationHelper = new ValidationHelper();
    private static final TransactionService transactionService = new TransactionService();

    public static void main(String[] args) {

        final Client senderAccount = new Client();
        boolean valid;

        do {
            System.out.println("Enter sender account: ");
            String accountSender = scanner.nextLine();
            senderAccount.setAccountId(accountSender);
            try {
                validationHelper.checkAccountIdLength(accountSender);
                valid = true;
            } catch (WrongFieldException e) {
                e.printStackTrace();
                valid = false;
            }
        } while (!valid);

        System.out.println("Enter recipients account: ");
        String recipientAccount = scanner.nextLine();
        while (recipientAccount.length() != 10) {
            try {
                validationHelper.checkAccountIdLength(recipientAccount);
            } catch (WrongFieldException e) {
                e.printStackTrace();
            }
            System.out.println("Enter recipients account again: ");
            recipientAccount = scanner.nextLine();
        }

        do {
            System.out.println("Enter transfer amount: ");
            double sum = scanner.nextDouble();
            try {
                validationHelper.checkSum(sum);
                valid = true;
            } catch (WrongSumException e) {
                e.printStackTrace();
                valid = false;
            }
        } while (!valid);

        transactionService.transferOfMoney(senderAccount, recipientAccount);
        System.out.println("Transfer is done.");
    }
}
