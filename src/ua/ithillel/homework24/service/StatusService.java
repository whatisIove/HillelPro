package ua.ithillel.homework24.service;

import ua.ithillel.homework24.util.Database;
import ua.ithillel.homework24.entity.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    private static final String INSERT = "INSERT INTO statuses (alias, description) VALUES (?, ?)";
    private static final String UPDATE = "UPDATE statuses SET alias=?, description=? WHERE id=?";
    private static final String DELETE = "DELETE FROM statuses WHERE id=?";
    private static final String GET_ALL = "SELECT * FROM statuses";

    public List<Status> findAll() {
        List<Status> resultList = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                Status status = new Status();
                status.setId(resultSet.getInt("id"));
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));
                resultList.add(status);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return resultList;
    }

    public void insert(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement prepStatement = connection.prepareStatement(INSERT)) {
            prepStatement.setString(1, status.getAlias());
            prepStatement.setString(2, status.getDescription());
            prepStatement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void update(Status status) {
        try (Connection connection = Database.getConnection();
             PreparedStatement prepStatement = connection.prepareStatement(UPDATE)) {
            prepStatement.setString(1, status.getAlias());
            prepStatement.setString(2, status.getDescription());
            prepStatement.setInt(3, status.getId());
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