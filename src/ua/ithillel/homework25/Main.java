package ua.ithillel.homework25;

import ua.ithillel.homework25.entity.Account;
import ua.ithillel.homework25.entity.Client;
import ua.ithillel.homework25.entity.Status;
import ua.ithillel.homework25.service.AccountService;
import ua.ithillel.homework25.service.ClientService;
import ua.ithillel.homework25.service.StatusService;

import java.util.List;

public class Main {
    private static final AccountService accountService = new AccountService();
    private static final ClientService clientService = new ClientService();
    private static final StatusService statusService = new StatusService();

    public static void main(String[] args) {

        final Client client = new Client("Hibernate", "hibernate@gmail.com", 380996965072L,
                "Hibernate", 20);
        clientService.save(client);

        final Status status = new Status("TEST", "DEPOSIT +2.2% per year");
        statusService.save(status);
        status.setAlias("DEPOSIT");
        statusService.update(status);

        final Account account = new Account(89, "5168750435758142", 4444.44);
        accountService.save(account);
        account.setValue(3333.33);
        accountService.delete(account);

        getClientById(1);
        getStatusById(2);
        getAccountById(3);
        findAllAccounts();
        findAllClients();
        findAllStatuses();
        findClientByPhone(380958089090L);
    }

    private static void getAccountById(final Integer id) {
        final Account findAccountById = accountService.getById(id);
        System.out.println(findAccountById);
    }

    private static void getClientById(final Integer id) {
        final Client findClientById = clientService.getById(id);
        System.out.println(findClientById);
    }

    private static void getStatusById(final Integer id) {
        final Status findStatusById = statusService.getById(id);
        System.out.println(findStatusById);
    }

    private static void findClientByPhone(final Long phone) {
        final Client clientGetByPhone = clientService.getByPhone(phone);
        System.out.println("clientGetByPhone = " + clientGetByPhone);
    }

    private static void findAllAccounts() {
        final List<Account> accounts = accountService.getAll();
        accounts.forEach(System.out::println);
    }

    private static void findAllClients() {
        final List<Client> clients = clientService.getAll();
        clients.forEach(System.out::println);
    }

    private static void findAllStatuses() {
        final List<Status> statuses = statusService.getAll();
        statuses.forEach(System.out::println);
    }
}