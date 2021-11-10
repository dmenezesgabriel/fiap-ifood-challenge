package com.ifood.factory;

import com.ifood.dao.SpecialtyDAO;
import com.ifood.dao.SpecialtyDAOImplPostgres;
import com.ifood.dao.StoreDAO;
import com.ifood.dao.StoreDAOImplPostgres;
import com.ifood.dao.AddressDAO;
import com.ifood.dao.AddressDAOImplPostgres;
import com.ifood.dao.ContactDAO;
import com.ifood.dao.ContactDAOImplPostgres;
import com.ifood.dao.PlanDAO;
import com.ifood.dao.PlanDAOImplPostgres;
import com.ifood.dao.ResponsibleDAO;
import com.ifood.dao.ResponsibleDAOImplPostgres;

public class DAOFactoryPostgres extends DAOFactory {

    @Override
    public SpecialtyDAO getSpecialtyDAO() {
        return new SpecialtyDAOImplPostgres();
    }

    @Override
    public PlanDAO getPlanDAO() {
        return new PlanDAOImplPostgres();
    }

    @Override
    public ResponsibleDAO getResponsibleDAO() {
        return new ResponsibleDAOImplPostgres();
    }

    @Override
    public AddressDAO getAddressDAO() {
        return new AddressDAOImplPostgres();
    }

    @Override
    public ContactDAO getContactDAO() {
        return new ContactDAOImplPostgres();
    }

    @Override
    public StoreDAO getStoreDAO() {
        return new StoreDAOImplPostgres();
    }
}