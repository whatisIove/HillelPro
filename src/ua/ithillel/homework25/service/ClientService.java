package ua.ithillel.homework25.service;

import ua.ithillel.homework25.dao.ClientDao;
import ua.ithillel.homework25.entity.Client;

import java.util.List;

public class ClientService {
    private final ClientDao clientDao = new ClientDao();

    public List<Client> getAll() {
        System.out.println("Getting all clients.");
        return clientDao.getAll();
    }

    public Client getById(final Integer id) {
        System.out.println("Id for getting client: " + id);
        return clientDao.getById(id);
    }

    public Client getByPhone(final Long phone) {
        System.out.println("Phone for getting client: " + phone);
        return clientDao.getByPhone(phone);
    }

    public void save(final Client client) {
        System.out.println("Client date for save: " + client.toString());
        clientDao.save(client);
    }

    public void update(final Client client) {
        System.out.println("Client date for update: " + client.toString());
        clientDao.update(client);
    }

    public void delete(final Client client) {
        System.out.println("Client for deleting: " + client.toString());
        clientDao.delete(client);
    }
}