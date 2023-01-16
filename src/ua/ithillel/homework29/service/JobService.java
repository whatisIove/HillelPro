package ua.ithillel.homework29.service;

import org.apache.log4j.Logger;
import ua.ithillel.homework29.dao.JobDao;
import ua.ithillel.homework29.entity.Job;

import java.util.List;

public class JobService {
    private final Logger logger = Logger.getLogger(JobService.class);
    private final JobDao jobDao = new JobDao();

    public List<Job> getAll() {
        logger.debug(String.format("Get all jobs: %s", jobDao.getAll()));
        return jobDao.getAll();
    }

    public Job getById(final Integer id) {
        logger.debug(String.format("getById. Get job by id for validation: %d", id));
        return jobDao.getById(id);
    }

    public void save(final Job job) {
        logger.debug(String.format("Job date for save: %s", job));
        jobDao.save(job);
    }

    public void update(final Job job) {
        logger.debug(String.format("Job date for update: %s", job));
        jobDao.update(job);
    }

    public void delete(final Job job) {
        logger.debug(String.format("Job date for delete: %s", job));
        jobDao.delete(job);
    }
}
