package ua.ithillel.homework29.service;

import org.apache.log4j.Logger;
import ua.ithillel.homework29.dao.StatusDao;
import ua.ithillel.homework29.entity.Status;

import java.util.List;

public class StatusService {
    private final Logger logger = Logger.getLogger(StatusService.class);
    private final StatusDao statusDao = new StatusDao();

    public List<Status> getAll() {
        logger.debug(String.format("Get all statuses: %s", statusDao.getAll()));
        return statusDao.getAll();
    }

    public Status getById(final Integer id) {
        logger.debug(String.format("getById. Get status by id for validation: %d", id));
        return statusDao.getById(id);
    }

    public void save(final Status status) {
        logger.debug(String.format("Status date for save: %s", status));
        statusDao.save(status);
    }

    public void update(final Status status) {
        logger.debug(String.format("Status date for update: %s", status));
        statusDao.update(status);
    }

    public void delete(final Status status) {
        logger.debug(String.format("Status date for delete: %s", status));
        statusDao.delete(status);
    }
}