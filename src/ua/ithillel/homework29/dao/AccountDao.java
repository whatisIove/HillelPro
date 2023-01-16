package ua.ithillel.homework29.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework29.entity.Account;
import ua.ithillel.homework29.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class AccountDao {
    private final Logger logger = Logger.getLogger(AccountDao.class);

    public Account getById(Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Account account = session.get(Account.class, id);

        if (id == null) {
            logger.debug(String.format("Account is null, where id = {%d}", account.getId()));
        }
        transaction.commit();
        session.close();

        return account;
    }

    public List<Account> getAll() {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNamedQuery("getAllAccounts");
        List<Account> accounts = query.getResultList();

        if (accounts == null) {
            logger.debug("Accounts is null.");
        }

        transaction.commit();
        session.close();

        return accounts;
    }

    public void save(final Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (account.getNumber() == null) {
            logger.debug(String.format("Account number is null: %s, id = %d", account.getNumber(), account.getId()));
        }
        session.save(account);

        transaction.commit();
        session.close();
    }

    public void update(final Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (account.getValue() == null) {
            logger.debug(String.format("Account value is null: %s, id = %d", account.getValue(), account.getId()));
        }
        session.update(account);

        transaction.commit();
        session.close();
    }

    public void delete(final Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (account.getClient() == null) {
            logger.debug(String.format("Account to client is null: %s, id = %d", account.getClient(), account.getId()));
        }
        session.delete(account);

        transaction.commit();
        session.close();
    }
}