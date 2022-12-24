package ua.ithillel.homework25.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework25.entity.Account;
import ua.ithillel.homework25.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class AccountDao {

    public Account getById(Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Account account = session.get(Account.class, id);

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

        transaction.commit();
        session.close();

        return accounts;
    }

    public void save(final Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(account);

        transaction.commit();
        session.close();
    }

    public void update(final Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(account);

        transaction.commit();
        session.close();
    }

    public void delete(final Account account) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(account);

        transaction.commit();
        session.close();
    }

}