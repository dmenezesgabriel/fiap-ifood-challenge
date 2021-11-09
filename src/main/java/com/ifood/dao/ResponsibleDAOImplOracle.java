package com.ifood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

import com.ifood.entity.Responsible;
import com.ifood.jdbc.ConnectionManager;
import com.ifood.util.Query;

public class ResponsibleDAOImplOracle implements ResponsibleDAO {
    private Connection connection;

    @Override
    public boolean register(Responsible responsible) {
        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/responsible_register.sql");
            stmt = (connection.prepareStatement(sql));
            // Set values
            stmt.setString(1, responsible.getName());
            stmt.setLong(2, responsible.getCpf());
            stmt.setLong(3, responsible.getRg());
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
    public boolean update(Responsible responsible) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/responsible_update.sql");
            stmt = (connection.prepareStatement(sql));

            // Set values
            stmt.setString(1, responsible.getName());
            stmt.setLong(2, responsible.getCpf());
            stmt.setLong(3, responsible.getRg());
            stmt.setInt(4, responsible.getId());
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
    public List<Responsible> getAll() {
        List<Responsible> responsibleList = new ArrayList<Responsible>();
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/responsbile_get_all.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("cd_responsavel");
                String name = result.getString("nm_responsavel");
                long cpf = result.getLong("nr_cpf");
                long rg = result.getLong("nr_rg");
                Responsible responsible = new Responsible(id, name, cpf, rg);
                responsibleList.add(responsible);
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
        return responsibleList;
    }

    @Override
    public Responsible getOne(int responsibleId) {
        Responsible responsible = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/responsible_get_one.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, responsibleId);
            result = stmt.executeQuery();
            if (result.next()) {
                int id = result.getInt("cd_responsavel");
                String name = result.getString("nm_responsavel");
                long cpf = result.getLong("nr_cpf");
                long rg = result.getLong("nr_rg");
                responsible = new Responsible(id, name, cpf, rg);
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
        return responsible;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/responsible_delete.sql");
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
            String sql = Query.fileToString("oracle/responsible_last_id.sql");
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