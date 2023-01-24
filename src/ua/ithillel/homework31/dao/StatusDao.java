package ua.ithillel.homework31.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework31.entity.Status;
import ua.ithillel.homework31.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class StatusDao {
    private final Logger logger = Logger.getLogger(StatusDao.class);

    public Status getById(Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Status status = session.get(Status.class, id);

        if (id == null) {
            logger.debug(String.format("Status is null, where id = {%d}", status.getId()));
        }

        transaction.commit();
        session.close();

        return status;
    }

    public List<Status> getAll() {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNamedQuery("getAllStatuses");
        List<Status> statuses = query.getResultList();

        if (statuses == null) {
            logger.debug("Statuses is null.");
        }

        transaction.commit();
        session.close();

        return statuses;
    }

    public void save(final Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (status.getAlias() == null) {
            logger.debug(String.format("Status alias is null: %s, id = %d", status.getAlias(), status.getId()));
        }
        session.save(status);

        transaction.commit();
        session.close();
    }

    public void update(final Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (status.getDescription() == null) {
            logger.debug(String.format("Status description is null: %s, id = %d",
                    status.getDescription(), status.getId()));
        }
        session.update(status);

        transaction.commit();
        session.close();
    }

    public void delete(final Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (status.getClients() == null) {
            logger.debug(String.format("Clients statuses is null: %s, id = %d",
                    status.getClients(), status.getId()));
        }
        session.delete(status);

        transaction.commit();
        session.close();
    }
}