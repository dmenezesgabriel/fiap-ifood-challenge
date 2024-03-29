package com.ifood.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.List;
import java.util.ArrayList;

import com.ifood.entity.Plan;
import com.ifood.jdbc.ConnectionManager;
import com.ifood.util.Query;

public class PlanDAOImplPostgres implements PlanDAO {
    private Connection connection;

    @Override
    public boolean register(Plan plan) {
        PreparedStatement stmt = null;

        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("/postgres/plan_register.sql");
            stmt = (connection.prepareStatement(sql));
            // Set values
            stmt.setString(1, plan.getName());
            stmt.setString(2, plan.getDescription());
            stmt.setDouble(3, plan.getCommission());
            stmt.setDouble(4, plan.getTax());
            stmt.setDouble(5, plan.getPrice());
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
    public boolean update(Plan plan) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("/postgres/plan_update.sql");
            stmt = (connection.prepareStatement(sql));

            // Set values
            stmt.setString(1, plan.getName());
            stmt.setString(2, plan.getDescription());
            stmt.setDouble(3, plan.getCommission());
            stmt.setDouble(4, plan.getTax());
            stmt.setDouble(5, plan.getPrice());
            stmt.setInt(6, plan.getId());
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
    public List<Plan> getAll() {
        List<Plan> planList = new ArrayList<Plan>();
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("/postgres/plan_get_all.sql");
            stmt = connection.prepareStatement(sql);
            result = stmt.executeQuery();
            while (result.next()) {
                int id = result.getInt("cd_plano");
                String name = result.getString("nm_plano");
                String description = result.getString("ds_plano");
                double comissao = result.getDouble("vl_comissao");
                double taxa = result.getDouble("vl_taxa");
                double preco = result.getDouble("vl_preco");
                Plan plan = new Plan(id, name, description, comissao, taxa, preco);
                planList.add(plan);
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
        return planList;
    }

    @Override
    public Plan getOne(int planId) {
        Plan plan = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("/postgres/plan_get_one.sql");
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, planId);
            result = stmt.executeQuery();
            if (result.next()) {
                int id = result.getInt("cd_plano");
                String name = result.getString("nm_plano");
                String description = result.getString("ds_plano");
                double commission = result.getDouble("vl_comissao");
                double tax = result.getDouble("vl_taxa");
                double price = result.getDouble("vl_preco");
                plan = new Plan(id, name, description, commission, tax, price);
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
        return plan;
    }

    @Override
    public boolean delete(int id) {
        PreparedStatement stmt = null;
        try {
            connection = ConnectionManager.getInstance().getConnection();
            String sql = Query.fileToString("/postgres/plan_delete.sql");
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
            String sql = Query.fileToString("/postgres/plan_last_id.sql");
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