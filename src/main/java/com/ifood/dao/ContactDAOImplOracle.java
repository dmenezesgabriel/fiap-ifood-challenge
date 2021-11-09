package com.ifood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

import com.ifood.entity.Contact;
import com.ifood.jdbc.ConnectionManager;
import com.ifood.util.Query;

public class ContactDAOImplOracle implements ContactDAO {
    private Connection connection;

    @Override
    public boolean register(Contact contact) {
        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_contact_register.sql");
            stmt = (connection.prepareStatement(sql));
            // Set values
            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getEmail());
            stmt.setLong(3, contact.getPhone());
            stmt.executeUpdate();
            return true;
        } catch (SQLException error) {
            error.printStackTrace();
            return false;
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException error) {
                error.printStackTrace();
            }
        }
    }

    @Override
    public boolean update(Contact contact) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_contact_update.sql");
            stmt = (connection.prepareStatement(sql));

            // Set values
            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getEmail());
            stmt.setLong(3, contact.getPhone());
            stmt.setInt(4, contact.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException error) {
            error.printStackTrace();
            return false;
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException error) {
                error.printStackTrace();
            }
        }
    }

    @Override
    public List<Contact> getAll() {
        List<Contact> contactList = new ArrayList<Contact>();
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_contact_get_all.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("cd_contato");
                String name = result.getString("nm_contato");
                String email = result.getString("ds_email");
                long phone = result.getLong("nr_celular");
                Contact contact = new Contact(id, name, email, phone);
                contactList.add(contact);
            }
        } catch (SQLException error) {
            error.printStackTrace();
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException error) {
                error.printStackTrace();
            }
        }
        return contactList;
    }

    @Override
    public Contact getOne(int contactId) {
        Contact contact = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_contact_get_one.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, contactId);
            result = stmt.executeQuery();
            if (result.next()) {
                int id = result.getInt("cd_contato");
                String name = result.getString("nm_contato");
                String email = result.getString("ds_email");
                long phone = result.getLong("nr_celular");
                contact = new Contact(id, name, email, phone);
            }
        } catch (SQLException error) {
            error.printStackTrace();
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException error) {
                error.printStackTrace();
            }
        }
        return contact;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_contact_delete.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException error) {
            error.printStackTrace();
            return false;
        }
    }

    @Override
    public int getLastId() {
        PreparedStatement stmt = null;
        ResultSet result = null;
        int id = 0;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_contact_seq_currval.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            if (result.next()) {
                id = result.getInt("CURRVAL");
            }
        } catch (SQLException error) {
            error.printStackTrace();
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException error) {
                error.printStackTrace();
            }
        }
        return id;
    }
}