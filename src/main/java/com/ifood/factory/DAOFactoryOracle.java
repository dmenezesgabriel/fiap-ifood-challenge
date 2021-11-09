package com.ifood.factory;

import com.ifood.dao.SpecialtyDAO;
import com.ifood.dao.SpecialtyDAOImplOracle;
import com.ifood.dao.StoreDAO;
import com.ifood.dao.StoreDAOImplOracle;
import com.ifood.dao.AddressDAO;
import com.ifood.dao.AddressDAOImplOracle;
import com.ifood.dao.ContactDAO;
import com.ifood.dao.ContactDAOImplOracle;
import com.ifood.dao.PlanDAO;
import com.ifood.dao.PlanDAOImplOracle;
import com.ifood.dao.ResponsibleDAO;
import com.ifood.dao.ResponsibleDAOImplOracle;

public class DAOFactoryOracle extends DAOFactory {

    @Override
    public SpecialtyDAO getSpecialtyDAO() {
        return new SpecialtyDAOImplOracle();
    }

    @Override
    public PlanDAO getPlanDAO() {
        return new PlanDAOImplOracle();
    }

    @Override
    public ResponsibleDAO getResponsibleDAO() {
        return new ResponsibleDAOImplOracle();
    }

    @Override
    public AddressDAO getAddressDAO() {
        return new AddressDAOImplOracle();
    }

    @Override
    public ContactDAO getContactDAO() {
        return new ContactDAOImplOracle();
    }

    @Override
    public StoreDAO getStoreDAO() {
        return new StoreDAOImplOracle();
    }
}