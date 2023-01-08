package ua.ithillel.homework26.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework26.entity.Client;
import ua.ithillel.homework26.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class ClientDao {

    public Client getById(final Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Client client = session.get(Client.class, id);

        transaction.commit();
        session.close();

        return client;
    }

    public Client getByPhone(final Long phone) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNamedQuery("getClientByPhone");
        query.setParameter("phone", phone);
        Client client = (Client) query.getSingleResult();

        transaction.commit();
        session.close();

        return client;
    }

    public List<Client> getAll() {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNamedQuery("getAllClients");
        final List<Client> clients = query.getResultList();

        transaction.commit();
        session.close();

        return clients;
    }

    public void save(final Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(client);

        transaction.commit();
        session.close();
    }

    public void update(final Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(client);

        transaction.commit();
        session.close();
    }

    public void delete(final Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(client);

        transaction.commit();
        session.close();
    }
}