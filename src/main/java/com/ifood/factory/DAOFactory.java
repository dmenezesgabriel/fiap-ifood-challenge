package com.ifood.factory;

import com.ifood.dao.UserDAO;

public abstract class DAOFactory {

    public static final int ORACLE = 1;
    private static DAOFactory oracleDAOFactory;

    public static DAOFactory getDAOFactory(int database) {
        switch (database) {
        case ORACLE:
            if (oracleDAOFactory == null) {
                oracleDAOFactory = new DAOFactoryOracle();
                return oracleDAOFactory;
            } else {
                return oracleDAOFactory;
            }
        default:
            return null;
        }
    }

    public abstract UserDAO getUserDAO();

}
