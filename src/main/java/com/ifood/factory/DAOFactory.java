package com.ifood.factory;

import com.ifood.dao.SpecialtyDAO;
import com.ifood.dao.StoreDAO;
import com.ifood.dao.AddressDAO;
import com.ifood.dao.ContactDAO;
import com.ifood.dao.PlanDAO;
import com.ifood.dao.ResponsibleDAO;

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

    public abstract SpecialtyDAO getSpecialtyDAO();

    public abstract PlanDAO getPlanDAO();

    public abstract ContactDAO getContactDAO();

    public abstract AddressDAO getAddressDAO();

    public abstract ResponsibleDAO getResponsibleDAO();

    public abstract StoreDAO getStoreDAO();

}
