package com.ifood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

import com.ifood.entity.Specialty;
import com.ifood.jdbc.ConnectionManager;
import com.ifood.util.Query;

public class SpecialtyDAOImplOracle implements SpecialtyDAO {
    private Connection connection;

    @Override
    public boolean register(Specialty specialty) {
        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/specialty_register.sql");
            stmt = (connection.prepareStatement(sql));
            // Set values
            stmt.setString(1, specialty.getName());
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
    public boolean update(Specialty specialty) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/specialty_update.sql");
            stmt = (connection.prepareStatement(sql));

            // Set values
            stmt.setString(1, specialty.getName());
            stmt.setInt(2, specialty.getId());
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
    public List<Specialty> getAll() {
        List<Specialty> specialtyList = new ArrayList<Specialty>();
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/specialty_get_all.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("cd_especialidade");
                String name = result.getString("nm_especialidade");
                Specialty specialty = new Specialty(id, name);
                specialtyList.add(specialty);
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
        return specialtyList;
    }

    @Override
    public Specialty getOne(int specialtyId) {
        Specialty specialty = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/specialty_get_one.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, specialtyId);
            result = stmt.executeQuery();
            if (result.next()) {
                int id = result.getInt("cd_especialidade");
                String name = result.getString("nm_especialidade");
                specialty = new Specialty(id, name);
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
        return specialty;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle/specialty_delete.sql");
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
            String sql = Query.fileToString("oracle/specialty_last_id.sql");
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