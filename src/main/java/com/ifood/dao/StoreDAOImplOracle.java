package com.ifood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

import com.ifood.entity.Store;
import com.ifood.jdbc.ConnectionManager;
import com.ifood.util.Query;

public class StoreDAOImplOracle implements StoreDAO {
    private Connection connection;

    @Override
    public boolean register(Store store) {
        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_store_register.sql");
            stmt = (connection.prepareStatement(sql));
            // Set values
            stmt.setString(1, store.getName());
            stmt.setString(2, store.getCompanyName());
            stmt.setLong(3, store.getCnpj());
            stmt.setLong(4, store.getPhone());
            stmt.setInt(5, store.getSpecialty().getId());
            stmt.setInt(6, store.getContact().getId());
            stmt.setInt(7, store.getAddress().getId());
            stmt.setInt(8, store.getResponsible().getId());
            stmt.setInt(9, store.getPlan().getId());
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
    public boolean update(Store store) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_store_update.sql");
            stmt = (connection.prepareStatement(sql));

            // Set values
            stmt.setString(1, store.getName());
            stmt.setString(2, store.getCompanyName());
            stmt.setLong(3, store.getCnpj());
            stmt.setLong(4, store.getPhone());
            stmt.setInt(5, store.getSpecialty().getId());
            stmt.setInt(6, store.getContact().getId());
            stmt.setInt(7, store.getAddress().getId());
            stmt.setInt(8, store.getResponsible().getId());
            stmt.setInt(9, store.getPlan().getId());
            stmt.setInt(10, store.getId());
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
    public List<Store> getAll() {
        List<Store> storeList = new ArrayList<Store>();
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_store_get_all.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("cd_loja");
                String name = result.getString("nm_loja");
                String companyName = result.getString("ds_razao_social");
                long cnpj = result.getLong("nr_cnpj");
                long phone = result.getLong("nr_telefone");
                int specialty = result.getInt("cd_especialidade");
                int contact = result.getInt("cd_contato");
                int address = result.getInt("cd_responsavel");
                int responsible = result.getInt("cd_plano");
                int plan = result.getInt("dt_criacao");
                Store store = new Store(id, name, companyName, cnpj, phone, specialty, contact, address, responsible,
                        plan);
                storeList.add(store);
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
        return storeList;
    }

    @Override
    public Store getOne(int storeId) {
        Store store = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_store_get_one.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, storeId);
            result = stmt.executeQuery();
            if (result.next()) {
                int id = result.getInt("cd_especialidade");
                String name = result.getString("nm_especialidade");
                store = new Store(id, name);
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
        return store;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_store_delete.sql");
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
            String sql = Query.fileToString("oracle_store_last_id.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            if (result.next()) {
                id = result.getInt("last_id");
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