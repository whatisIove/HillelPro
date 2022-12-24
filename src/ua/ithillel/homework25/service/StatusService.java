package ua.ithillel.homework25.service;

import ua.ithillel.homework25.dao.StatusDao;
import ua.ithillel.homework25.entity.Status;

import java.util.List;

public class StatusService {
    private final StatusDao statusDao = new StatusDao();

    public List<Status> getAll() {
        System.out.println("Getting all statuses.");
        return statusDao.getAll();
    }

    public Status getById(final Integer id) {
        System.out.println("Id for getting status: " + id);
        return statusDao.getById(id);
    }

    public void save(final Status status) {
        System.out.println("Status date for save: " + status.toString());
        statusDao.save(status);
    }

    public void update(final Status status) {
        System.out.println("Status date for update: " + status.toString());
        statusDao.update(status);
    }

    public void delete(final Status status) {
        System.out.println("Status for deleting: " + status.toString());
        statusDao.delete(status);
    }
}