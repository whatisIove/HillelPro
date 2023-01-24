package ua.ithillel.homework31;

import ua.ithillel.homework31.entity.Account;
import ua.ithillel.homework31.entity.Client;
import ua.ithillel.homework31.entity.Job;
import ua.ithillel.homework31.entity.Status;
import ua.ithillel.homework31.exception.client.WrongClientPhone;
import ua.ithillel.homework31.exception.status.WrongGetByIdStatus;
import ua.ithillel.homework31.service.AccountService;
import ua.ithillel.homework31.service.ClientService;
import ua.ithillel.homework31.service.JobService;
import ua.ithillel.homework31.service.StatusService;

import java.util.HashSet;
import java.util.List;


public class Main {
    private static final AccountService accountService = new AccountService();
    private static final ClientService clientService = new ClientService();
    private static final StatusService statusService = new StatusService();
    private static final JobService jobService = new JobService();

    public static void main(String[] args) {

        final HashSet<Client> clients = new HashSet<>();
        final Client client = new Client("Vadick", "vadick@mail.ua", 911L,
                "None", 27);

        final Job job = new Job();
        job.setName("POLICE");
        job.setSchedule("Monday through Friday.");
        client.setJob(job);
        job.setClient(client);

        final Account account = new Account();
        account.setNumber("1234567890987654");
        account.setValue(123456.00);
        account.setClient(client);

        final Account accountSecond = new Account();
        accountSecond.setNumber("12345678909876545");
        accountSecond.setValue(1234567.00);
        accountSecond.setClient(client);

        final HashSet<Status> statuses = new HashSet<>();
        final Status status = new Status("BLOCKED", "BLOCKED.");

        statuses.add(status);
        client.setStatuses(statuses);
        status.setClients(clients);

        final HashSet<Account> accounts = new HashSet<>();
        accounts.add(account);
        accounts.add(accountSecond);

        client.setAccounts(accounts);

        jobService.save(job);
        statusService.save(status);
        accountService.save(account);
        accountService.save(accountSecond);
        clientService.save(client);

        accountService.getById(1);
    }

    private static void getAccountById(final Integer id) {
        final Account findAccountById = accountService.getById(id);
        System.out.println(findAccountById);
    }

    private static void getClientById(final Integer id) {
        final Client findClientById = clientService.getById(id);
        System.out.println(findClientById);
    }

    private static void getStatusById(final Integer id) throws WrongGetByIdStatus {
        final Status findStatusById = statusService.getById(id);
        System.out.println(findStatusById);
    }

    private static void getJobById(final Integer id) {
        final Job findJobById = jobService.getById(id);
        System.out.println(findJobById);
    }

    private static void findClientByPhone(final Long phone) throws WrongClientPhone {
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

    private static void findAllJobs() {
        final List<Job> jobs = jobService.getAll();
        jobs.forEach(System.out::println);
    }
}