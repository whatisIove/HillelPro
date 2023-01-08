package ua.ithillel.homework26.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework26.entity.Status;
import ua.ithillel.homework26.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class StatusDao {

    public Status getById(Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Status status = session.get(Status.class, id);

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

        transaction.commit();
        session.close();

        return statuses;
    }

    public void save(final Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(status);

        transaction.commit();
        session.close();
    }

    public void update(final Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(status);

        transaction.commit();
        session.close();
    }

    public void delete(final Status status) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(status);

        transaction.commit();
        session.close();
    }
}
