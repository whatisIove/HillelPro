package ua.ithillel.homework24;

import ua.ithillel.homework24.entity.Account;
import ua.ithillel.homework24.entity.Client;
import ua.ithillel.homework24.entity.Status;
import ua.ithillel.homework24.service.AccountService;
import ua.ithillel.homework24.service.ClientService;
import ua.ithillel.homework24.service.StatusService;
import ua.ithillel.homework24.util.ClientForm;

import java.util.List;

public class Main {

    public static final ClientService clientService = new ClientService();
    public static final StatusService statusService = new StatusService();
    public static final AccountService accountService = new AccountService();

    public static void main(String[] args) {

        final Client client = new Client("Whatislove", "whatislove@gmail.com", 380696965072L,
                "New client", 22);
        clientService.insert(client);

        final Status status = new Status("DELUXE", "NO LIMIT ABSOLUTE!");
        statusService.insert(status);
        status.setAlias("INSANE");
        statusService.update(status);

        final Account account = new Account(88, "5168750435758141", 2222.22);
        accountService.insert(account);
        account.setValue(3333.33);
        accountService.delete(38);

        findAllClients();
        findAllAccounts();
        findAllStatuses();
        findClientByPhone(380958089090L);
        getCardNumberWhereTheValueIsGreaterThan(77777.77);
        getClientByIdWhichEqualsAccountId(2);
        getClientsWhoseAgeIsAbove(18);

    }

    private static void getClientsWhoseAgeIsAbove(final Integer age) {
        final List<ClientForm> clientForm = clientService.getByAge(age);
        clientForm.forEach(System.out::println);
    }

    private static void getClientByIdWhichEqualsAccountId(final Integer clientID) {
        final Account account = new Account();
        account.setClientId(clientID);
        final List<Client> clientIdToAccount = clientService.getByID(account);
        clientIdToAccount.forEach(System.out::println);
    }

    private static void getCardNumberWhereTheValueIsGreaterThan(final Double value) {
        final List<String> accountsWhereTheAmountIsMoreThan = accountService.getNumberByValue(value);
        accountsWhereTheAmountIsMoreThan.forEach(System.out::println);
    }

    private static void findClientByPhone(final Long phone) {
        final Client clientServiceByPhone = clientService.findByPhone(phone);
        System.out.println("clientServiceByPhone = " + clientServiceByPhone);
    }

    private static void findAllAccounts() {
        final List<Account> accounts = accountService.findAll();
        accounts.forEach(System.out::println);
    }

    private static void findAllClients() {
        final List<Client> clients = clientService.findAll();
        clients.forEach(System.out::println);
    }

    private static void findAllStatuses() {
        final List<Status> statuses = statusService.findAll();
        statuses.forEach(System.out::println);
    }
}