package ua.ithillel.homework29.service;

import org.apache.log4j.Logger;
import ua.ithillel.homework29.dao.AccountDao;
import ua.ithillel.homework29.entity.Account;

import java.util.List;

public class AccountService {
    private final Logger logger = Logger.getLogger(AccountService.class);
    private final AccountDao accountDao = new AccountDao();

    public List<Account> getAll() {
        logger.debug(String.format("Get all accounts: %s", accountDao.getAll()));
        return accountDao.getAll();
    }

    public Account getById(final Integer id) {
        logger.debug(String.format("getById. Get by id for validation: %d", id));
        return accountDao.getById(id);
    }

    public void save(final Account account) {
        logger.debug(String.format("Account date for save: %s", account));
        accountDao.save(account);
    }

    public void update(final Account account) {
        logger.debug(String.format("Account date for update: %s", account));
        accountDao.update(account);
    }

    public void delete(final Account account) {
        logger.debug(String.format("Account date for delete: %s", account));
        accountDao.delete(account);
    }
}