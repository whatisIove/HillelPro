package ua.ithillel.homework26.service;

import ua.ithillel.homework26.dao.JobDao;
import ua.ithillel.homework26.entity.Job;

import java.util.List;

public class JobService {
    private final JobDao jobDao = new JobDao();

    public List<Job> getAll() {
        System.out.println("Getting all job.");
        return jobDao.getAll();
    }

    public Job getById(final Integer id) {
        System.out.println("Id for getting job: " + id);
        return jobDao.getById(id);
    }

    public void save(final Job job) {
        System.out.println("Job date for save: " + job.toString());
        jobDao.save(job);
    }

    public void update(final Job job) {
        System.out.println("Job date for update: " + job.toString());
        jobDao.update(job);
    }

    public void delete(final Job job) {
        System.out.println("Job for deleting: " + job.toString());
        jobDao.delete(job);
    }
}