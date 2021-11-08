package com.ifood.factory;

import com.ifood.dao.UserDAO;
import com.ifood.dao.UserDAOImplOracle;

public class DAOFactoryOracle extends DAOFactory {

    @Override
    public UserDAO getUserDAO() {
        return new UserDAOImplOracle();
    }
}