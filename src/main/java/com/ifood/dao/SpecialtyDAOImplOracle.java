package com.ifood.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

import com.ifood.entity.Specialty;
import com.ifood.jdbc.ConnectionManager;
import com.ifood.util.Query;

import oracle.jdbc.OracleTypes;

public class SpecialtyDAOImplOracle implements SpecialtyDAO {
    private Connection connection;

    @Override
    public int register(Specialty specialty) {
        CallableStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("oracle_specialty_register.sql");
            stmt = connection.prepareCall(sql);
            // Set values
            stmt.setString(1, specialty.getName());
            stmt.registerOutParameter(2, OracleTypes.NUMBER);
            stmt.executeUpdate();
            int insertedID = stmt.getInt(2);
            return insertedID;
        } catch (SQLException error) {
            error.printStackTrace();
            return 0;
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
            String sql = Query.fileToString("oracle_specialty_update.sql");
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
            String sql = Query.fileToString("oracle_specialty_get_all.sql");
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
            String sql = Query.fileToString("oracle_specialty_get_one.sql");
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
            String sql = Query.fileToString("oracle_specialty_delete.sql");
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