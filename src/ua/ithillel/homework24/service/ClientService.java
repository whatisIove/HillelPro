package ua.ithillel.homework24.service;

import ua.ithillel.homework24.entity.Account;
import ua.ithillel.homework24.util.ClientForm;
import ua.ithillel.homework24.util.Database;
import ua.ithillel.homework24.entity.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private static final String INSERT = "INSERT INTO clients (id, name, email, phone, about, age) " +
            "VALUES (?, ?, ?, ?, ?, ?)";
    private static final String UPDATE = "UPDATE clients SET name=?, email=?, phone=?, about=?, age=? WHERE id=?";
    private static final String DELETE = "DELETE FROM clients WHERE id=?";
    private static final String GET_ALL = "SELECT * FROM clients";
    private static final String BY_ID_FROM_ACCOUNTS = "SELECT * FROM clients WHERE id=?";
    private static final String BY_PHONE = "SELECT * FROM Clients WHERE phone=?";
    private static final String BY_AGE = """
            SELECT cl.name, cl.email, cl.phone, s.alias FROM client_statuses AS cs
            LEFT JOIN statuses s on s.id=cs.status_id LEFT JOIN clients cl on cl.id=cs.client_id WHERE age>?""";

    public List<Client> findAll() {
        List<Client> resultList = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                resultList.add(createClient(resultSet));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return resultList;
    }

    public List<Client> getByID(Account account) {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(BY_ID_FROM_ACCOUNTS)) {
            preparedStatement.setInt(1, account.getClientId());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setAbout(resultSet.getString("about"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public Client findByPhone(Long phone) {
        Client client = new Client();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(BY_PHONE)) {
            connection.setAutoCommit(false);
            preparedStatement.setLong(1, phone);
            ResultSet result = preparedStatement.executeQuery();
            connection.commit();
            while (result.next()) {
                client.setId(result.getInt("id"));
                client.setName(result.getString("name"));
                client.setEmail(result.getString("email"));
                client.setAbout(result.getString("about"));
                client.setPhone(result.getLong("phone"));
                client.setAge(result.getInt("age"));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    public List<ClientForm> getByAge(int age) {
        List<ClientForm> clientFormList = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(BY_AGE)) {
            preparedStatement.setInt(1, age);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ClientForm clientForm = new ClientForm();
                clientForm.setName(resultSet.getString("name"));
                clientForm.setAlias(resultSet.getString("alias"));
                clientForm.setEmail(resultSet.getString("email"));
                clientFormList.add(clientForm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientFormList;
    }

    private Client createClient(ResultSet resultSet) throws SQLException {
        Client client = new Client();
        client.setId(resultSet.getInt("id"));
        client.setName(resultSet.getString("name"));
        client.setEmail(resultSet.getString("email"));
        client.setPhone(resultSet.getLong("phone"));
        client.setAbout(resultSet.getString("about"));
        client.setAge(resultSet.getInt("age"));
        return client;
    }

    public void insert(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement prepStatement = connection.prepareStatement(INSERT)) {
            prepStatement.setString(1, client.getName());
            prepStatement.setString(2, client.getEmail());
            prepStatement.setLong(3, client.getPhone());
            prepStatement.setString(4, client.getAbout());
            prepStatement.setInt(5, client.getAge());
            prepStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void update(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement prepStatement = connection.prepareStatement(UPDATE)) {
            prepStatement.setString(1, client.getName());
            prepStatement.setString(2, client.getEmail());
            prepStatement.setLong(3, client.getPhone());
            prepStatement.setString(4, client.getAbout());
            prepStatement.setInt(5, client.getAge());
            prepStatement.setInt(6, client.getId());
            prepStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE)) {
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}