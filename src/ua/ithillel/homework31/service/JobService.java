package ua.ithillel.homework31.service;

import org.apache.log4j.Logger;
import ua.ithillel.homework31.dao.JobDao;
import ua.ithillel.homework31.entity.Job;
import ua.ithillel.homework31.exception.job.WrongJobInfo;

import java.util.List;

public class JobService {
    private final Logger logger = Logger.getLogger(JobService.class);
    private final JobDao jobDao = new JobDao();


    public boolean validateJob(final List<Job> jobs, final Job job) throws WrongJobInfo {
        if (jobs == null || !jobs.contains(job)) {
            throw new WrongJobInfo("Jobs is null or does not contain job.");
        }
        return false;
    }

    public boolean validateOneJob(final Job job) throws WrongJobInfo {
        if (job == null) {
            throw new WrongJobInfo("Job is null.");
        }
        return false;
    }

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
