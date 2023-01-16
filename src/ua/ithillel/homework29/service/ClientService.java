package ua.ithillel.homework29.service;

import org.apache.log4j.Logger;
import ua.ithillel.homework29.dao.ClientDao;
import ua.ithillel.homework29.entity.Client;

import java.util.List;

public class ClientService {
    private final Logger logger = Logger.getLogger(ClientService.class);
    private final ClientDao clientDao = new ClientDao();

    public List<Client> getAll() {
        logger.debug(String.format("Get all accounts: %s", clientDao.getAll()));
        return clientDao.getAll();
    }

    public Client getById(final Integer id) {
        logger.debug(String.format("getById. Get client by id for validation: %d", id));
        return clientDao.getById(id);
    }

    public Client getByPhone(final Long phone) {
        logger.debug(String.format("getByPhone. Get by phone for validation: %d", phone));
        return clientDao.getByPhone(phone);
    }

    public void save(final Client client) {
        logger.debug(String.format("Client date for save: %s", client));
        clientDao.save(client);
    }

    public void update(final Client client) {
        logger.debug(String.format("Client date for update: %s", client));
        clientDao.update(client);
    }

    public void delete(final Client client) {
        logger.debug(String.format("Client date for delete: %s", client));
        clientDao.delete(client);
    }
}