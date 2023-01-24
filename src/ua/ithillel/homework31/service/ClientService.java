package ua.ithillel.homework31.service;

import org.apache.log4j.Logger;
import ua.ithillel.homework31.dao.ClientDao;
import ua.ithillel.homework31.entity.Client;
import ua.ithillel.homework31.exception.client.*;

import java.util.List;

public class ClientService {
    private final Logger logger = Logger.getLogger(ClientService.class);
    private final ClientDao clientDao = new ClientDao();

    public boolean validateClient(final Client client) throws WrongClientInfo {
        if (client == null) {
            throw new WrongClientEmail("Client is null.");
        }
        return false;
    }

    public boolean validateEmail(final String email) throws WrongClientEmail {
        if (email == null || email.isBlank()) {
            throw new WrongClientEmail("Email is wrong or null.");
        }
        return false;
    }

    public boolean validateName(final String name) throws WrongClientName {
        if (name == null || name.isBlank()) {
            throw new WrongClientName("Name is wrong or null.");
        }
        return false;
    }

    public boolean validatePhone(final Long phone) throws WrongClientPhone {
        if (phone == null) {
            throw new WrongClientPhone("Phone is wrong or null.");
        }
        return false;
    }

    public boolean validateAge(final Integer age) throws WrongClientAge {
        if (age == null || age <= 18) {
            throw new WrongClientAge("Age is wrong or null.");
        }
        return false;
    }

    public List<Client> getAll() {
        logger.debug(String.format("Get all accounts: %s", clientDao.getAll()));
        return clientDao.getAll();
    }

    public Client getById(final Integer id) {
        logger.debug(String.format("getById. Get client by id for validation: %d", id));
        return clientDao.getById(id);
    }

    public Client getByPhone(final Long phone) throws IncorrectClientPhone {
        if (phone >= 3800000000L) {
            throw new IncorrectClientPhone("Phone is incorrect.");
        }
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