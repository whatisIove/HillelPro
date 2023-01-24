package ua.ithillel.homework31.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework31.entity.Client;
import ua.ithillel.homework31.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class ClientDao {
    private final Logger logger = Logger.getLogger(ClientDao.class);

    public Client getById(final Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Client client = session.get(Client.class, id);

        if (id == null) {
            logger.debug(String.format("Client is null, where id = {%d}", client.getId()));
        }
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

        if (client.getPhone() == null) {
            logger.debug(String.format("Client phone is null: %s, id = %d", client.getPhone(), client.getId()));
        }
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

        if (clients == null) {
            logger.debug("Clients is null.");
        }

        transaction.commit();
        session.close();

        return clients;
    }

    public void save(final Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (client.getName() == null) {
            logger.debug(String.format("Client name is null: %s, id = %d", client.getName(), client.getId()));
        }
        session.save(client);

        transaction.commit();
        session.close();
    }

    public void update(final Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (client.getEmail() == null) {
            logger.debug(String.format("Client email is null: %s, id = %d", client.getEmail(), client.getId()));
        }
        session.update(client);

        transaction.commit();
        session.close();
    }

    public void delete(final Client client) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (client.getJob() == null) {
            logger.debug(String.format("Client job is null: %s, id = %d", client.getJob(), client.getId()));
        }
        session.delete(client);

        transaction.commit();
        session.close();
    }
}