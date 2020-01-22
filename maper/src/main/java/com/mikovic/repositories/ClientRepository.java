package com.mikovic.repositories;

import com.mikovic.model.Client;

import java.sql.*;
import java.util.*;

public class ClientRepository {
    private Map<Integer, Client> identityMap = new HashMap<>();

    public void insert(Connection conn, Client client) {

        PreparedStatement stat = null;
        int id = 0;
        String insertSql = "INSERT into clients (first_name, last_name, birth_date, description) values(?, ?, ?, ?);";
        try {

            stat = conn.prepareStatement(insertSql);
            stat.setString(1, client.getFirstName());
            stat.setString(2, client.getLastName());
            stat.setTimestamp(3, Timestamp.valueOf(client.getBirthday().atStartOfDay()));
            stat.setString(4, client.getDescription());
            stat.executeUpdate();
            id = findId(conn, client);
            client.setId(id);
            identityMap.put(id, client);
        } catch (SQLException e) {
            System.err.println("Ошибка выполнения команды: " + e.getLocalizedMessage());
            System.err.println("Код ошибки: " + e.getErrorCode());
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                System.err.println("Ошибка при закрытии оператора: " + e.getLocalizedMessage());
                System.err.println("Код ошибки: " + e.getErrorCode());
            }
        }
    }

    public void update(Connection conn, Client client) {

        PreparedStatement stat = null;
        String insertSql = "Update clients SET description = ?  WHERE id = ?;";
        try {
            stat = conn.prepareStatement(insertSql);
            stat.setString(1, client.getDescription());
            stat.setInt(2, client.getId());
            stat.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Ошибка выполнения команды: " + e.getLocalizedMessage());
            System.err.println("Код ошибки: " + e.getErrorCode());
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                System.err.println("Ошибка при закрытии оператора: " + e.getLocalizedMessage());
                System.err.println("Код ошибки: " + e.getErrorCode());
            }

        }
    }

    public void delete(Connection conn, Client client) {
        identityMap.remove(client.getId());
        int result = -1;
        PreparedStatement stat = null;
        String insertSql = "DELETE from clients WHERE id = ?;";
        try {
            stat = conn.prepareStatement(insertSql);
            stat.setInt(1, client.getId());
            int count = stat.executeUpdate();
            result = 0;

        } catch (SQLException e) {
            System.err.println("Ошибка выполнения команды: " + e.getLocalizedMessage());
            System.err.println("Код ошибки: " + e.getErrorCode());
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                System.err.println("Ошибка при закрытии оператора: " + e.getLocalizedMessage());
                System.err.println("Код ошибки: " + e.getErrorCode());
            }
        }
    }

    public Client findById(Connection conn, Integer id) {
        if (identityMap.containsKey(id)) {
            return identityMap.get(id);
        }
        Client client = null;
        PreparedStatement stat = null;

        try {
            String selectSql = "SELECT * from clients WHERE id = ?;";
            stat = conn.prepareStatement(selectSql);
            stat.setInt(1, id);
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {
                client = new Client();
                client.setId(rs.getInt(1));
                client.setFirstName(rs.getString(2));
                client.setLastName(rs.getString(3));
                client.setBirthday(rs.getTimestamp(4).toLocalDateTime().toLocalDate());
                client.setDescription(rs.getString(5));
            }
        } catch (SQLException e) {
            System.err.println("Ошибка выполнения команды: " + e.getLocalizedMessage());
            System.err.println("Код ошибки: " + e.getErrorCode());
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                System.err.println("Ошибка при закрытии оператора: " + e.getLocalizedMessage());
                System.err.println("Код ошибки: " + e.getErrorCode());
            }
        }
        return client;
    }

    public List<Client> findAll(Connection conn) {
        Statement stat = null;
        Client client = null;
        List<Client> clients = new ArrayList<>();
        try {
            String selectSql = "SELECT * from clients;";
            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(selectSql);
            while (rs.next()) {
                client = new Client();
                client.setId(rs.getInt(1));
                client.setFirstName(rs.getString(2));
                client.setLastName(rs.getString(3));
                client.setBirthday(rs.getTimestamp(4).toLocalDateTime().toLocalDate());
                client.setDescription(rs.getString(5));
                clients.add(client);
                System.out.println(rs.getString(4));
            }
        } catch (SQLException e) {
            System.err.println("Ошибка выполнения команды: " + e.getLocalizedMessage());
            System.err.println("Код ошибки: " + e.getErrorCode());
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                System.err.println("Ошибка при закрытии оператора: " + e.getLocalizedMessage());
                System.err.println("Код ошибки: " + e.getErrorCode());
            }
        }
        return clients;
    }

    private int findId(Connection conn, Client client) {

        PreparedStatement stat = null;
        int id = 0;
        try {
            String selectSql = "SELECT id  from clients WHERE first_name = ?  AND birth_date = ?;";
            stat = conn.prepareStatement(selectSql);
            stat.setString(1, client.getFirstName());
            stat.setTimestamp(2,Timestamp.valueOf(client.getBirthday().atStartOfDay()));
            ResultSet rs = stat.executeQuery();
            while (rs.next()) {

                id = rs.getInt(1);

            }
        } catch (SQLException e) {
            System.err.println("Ошибка выполнения команды: " + e.getLocalizedMessage());
            System.err.println("Код ошибки: " + e.getErrorCode());
        } finally {
            try {
                stat.close();
            } catch (SQLException e) {
                System.err.println("Ошибка при закрытии оператора: " + e.getLocalizedMessage());
                System.err.println("Код ошибки: " + e.getErrorCode());
            }
        }
        return id;
    }
}
