package ua.ithillel.homework24.service;

import ua.ithillel.homework24.util.Database;
import ua.ithillel.homework24.entity.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static final String INSERT = "INSERT INTO accounts (client_id, number, value) VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE accounts SET client_id=?, number=?, value=? WHERE id=?";
    private static final String DELETE = "DELETE FROM accounts WHERE id=?";
    private static final String GET_ALL = "SELECT * FROM accounts";
    private static final String GET_NUMBER_BY_VALUE = "SELECT number FROM accounts WHERE value>?";

    public List<Account> findAll() {
        List<Account> resultList = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClientId(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                resultList.add(account);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return resultList;
    }

    public List<String> getNumberByValue(double value) {
        List<String> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_NUMBER_BY_VALUE)) {
            preparedStatement.setDouble(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                accounts.add(resultSet.getString("number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void insert(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement prepStatement = connection.prepareStatement(INSERT)) {
            prepStatement.setInt(1, account.getClientId());
            prepStatement.setString(2, account.getNumber());
            prepStatement.setDouble(3, account.getValue());
            prepStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void update(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement prepStatement = connection.prepareStatement(UPDATE)) {
            prepStatement.setInt(1, account.getClientId());
            prepStatement.setString(2, account.getNumber());
            prepStatement.setDouble(3, account.getValue());
            prepStatement.setInt(4, account.getId());
            prepStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement prepStatement = connection.prepareStatement(DELETE)) {
            prepStatement.setInt(1, id);
            prepStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}