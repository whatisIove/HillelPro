package ua.ithillel.homework26.service;

import ua.ithillel.homework26.dao.AccountDao;
import ua.ithillel.homework26.entity.Account;

import java.util.List;

public class AccountService {
    private final AccountDao accountDao = new AccountDao();

    public List<Account> getAll() {
        System.out.println("Getting all accounts.");
        return accountDao.getAll();
    }

    public Account getById(final Integer id) {
        System.out.println("Id for getting account: " + id);
        return accountDao.getById(id);
    }

    public void save(final Account account) {
        System.out.println("Account date for save: " + account.toString());
        accountDao.save(account);
    }

    public void update(final Account account) {
        System.out.println("Account date for update: " + account.toString());
        accountDao.update(account);
    }

    public void delete(final Account account) {
        System.out.println("Account for deleting: " + account.toString());
        accountDao.delete(account);
    }
}