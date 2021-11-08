package com.ifood.factory;

import com.ifood.dao.SpecialtyDAO;
import com.ifood.dao.SpecialtyDAOImplOracle;

public class DAOFactoryOracle extends DAOFactory {

    @Override
    public SpecialtyDAO getUserDAO() {
        return new SpecialtyDAOImplOracle();
    }
}