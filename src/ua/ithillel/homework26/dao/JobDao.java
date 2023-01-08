package ua.ithillel.homework26.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework26.entity.Job;
import ua.ithillel.homework26.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class JobDao {

    public Job getById(Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Job job = session.get(Job.class, id);

        transaction.commit();
        session.close();

        return job;
    }

    public List<Job> getAll() {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNamedQuery("getAllJobs");
        List<Job> jobs = query.getResultList();

        transaction.commit();
        session.close();

        return jobs;
    }

    public void save(final Job job) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(job);

        transaction.commit();
        session.close();
    }

    public void update(final Job job) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.update(job);

        transaction.commit();
        session.close();
    }

    public void delete(final Job job) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.delete(job);

        transaction.commit();
        session.close();
    }
}