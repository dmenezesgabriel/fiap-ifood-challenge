package com.ifood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

import com.ifood.entity.Address;
import com.ifood.jdbc.ConnectionManager;
import com.ifood.util.Query;

public class AddressDAOImplOracle implements AddressDAO {
    private Connection connection;

    @Override
    public boolean register(Address address) {
        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_address_register.sql");
            stmt = (connection.prepareStatement(sql));
            // Set values
            stmt.setInt(1, address.getPostalCode());
            stmt.setString(2, address.getState());
            stmt.setString(3, address.getCity());
            stmt.setString(4, address.getDistrict());
            stmt.setString(5, address.getAddress());
            stmt.setInt(6, address.getNumber());
            stmt.setString(7, address.getAdjunct());
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
    public boolean update(Address address) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_address_update.sql");
            stmt = (connection.prepareStatement(sql));

            // Set values
            stmt.setInt(1, address.getPostalCode());
            stmt.setString(2, address.getState());
            stmt.setString(3, address.getCity());
            stmt.setString(4, address.getDistrict());
            stmt.setString(5, address.getAddress());
            stmt.setInt(6, address.getNumber());
            stmt.setString(7, address.getAdjunct());
            stmt.setInt(8, address.getId());
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
    public List<Address> getAll() {
        List<Address> addressList = new ArrayList<Address>();
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_address_get_all.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("cd_endereco");
                int postalCode = result.getInt("cd_cep");
                String state = result.getString("nm_estado");
                String city = result.getString("nm_cidade");
                String district = result.getString("nm_bairro");
                String description = result.getString("ds_endereco");
                int number = result.getInt("nr_numero");
                String adjunct = result.getString("ds_complemento");

                Address address = new Address(id, postalCode, state, city, district, description, number, adjunct);
                addressList.add(address);
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
        return addressList;
    }

    @Override
    public Address getOne(int addressId) {
        Address address = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_address_get_one.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, addressId);
            result = stmt.executeQuery();
            if (result.next()) {
                int id = result.getInt("cd_endereco");
                int postalCode = result.getInt("cd_cep");
                String state = result.getString("nm_estado");
                String city = result.getString("nm_cidade");
                String district = result.getString("nm_bairro");
                String description = result.getString("ds_endereco");
                int number = result.getInt("nr_numero");
                String adjunct = result.getString("ds_complemento");
                address = new Address(id, postalCode, state, city, district, description, number, adjunct);
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
        return address;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_address_delete.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException error) {
            error.printStackTrace();
            return false;
        }
    }
}