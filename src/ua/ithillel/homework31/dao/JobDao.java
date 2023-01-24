package ua.ithillel.homework31.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ua.ithillel.homework31.entity.Job;
import ua.ithillel.homework31.util.HibernateConfiguration;

import javax.persistence.Query;
import java.util.List;

public class JobDao {
    private final Logger logger = Logger.getLogger(JobDao.class);

    public Job getById(Integer id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Job job = session.get(Job.class, id);

        if (id == null) {
            logger.debug(String.format("Job is null, where id = {%d}", job.getJobId()));
        }

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

        if (jobs == null) {
            logger.debug("Jobs is null.");
        }

        transaction.commit();
        session.close();

        return jobs;
    }

    public void save(final Job job) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (job.getName() == null) {
            logger.debug(String.format("Job name is null: %s, id = %d", job.getName(), job.getJobId()));
        }
        session.save(job);

        transaction.commit();
        session.close();
    }

    public void update(final Job job) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (job.getSchedule() == null) {
            logger.debug(String.format("Job schedule is null: %s, id = %d", job.getSchedule(), job.getJobId()));
        }
        session.update(job);

        transaction.commit();
        session.close();
    }

    public void delete(final Job job) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        if (job.getClient() == null) {
            logger.debug(String.format("Job to client is null: %s, id = %d", job.getClient(), job.getJobId()));
        }
        session.delete(job);

        transaction.commit();
        session.close();
    }
}