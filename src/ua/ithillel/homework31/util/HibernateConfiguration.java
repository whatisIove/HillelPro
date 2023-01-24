package ua.ithillel.homework31.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ua.ithillel.homework31.entity.Account;
import ua.ithillel.homework31.entity.Client;
import ua.ithillel.homework31.entity.Job;
import ua.ithillel.homework31.entity.Status;

public class HibernateConfiguration {
    private static final Logger logger = Logger.getLogger(HibernateConfiguration.class);
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Account.class);
                configuration.addAnnotatedClass(Status.class);
                configuration.addAnnotatedClass(Job.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                logger.error(String.format("Session factory Error: " + e));
            }
        } else {
            logger.info("Session factory already exists");
        }
        return sessionFactory;
    }
}