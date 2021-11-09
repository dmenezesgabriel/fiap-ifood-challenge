package com.ifood.dao;

import java.util.List;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;

import com.ifood.entity.Address;
import com.ifood.factory.DAOFactory;

import org.junit.Test;

public class AddressDAOTest {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    @Test
    public void shouldAnswerWithTrue() {
        logger.info("Testing Speciality DAO Class");
        AddressDAO addressDAO = (DAOFactory.getDAOFactory(DAOFactory.ORACLE).getAddressDAO());
        Address address = new Address();
        address.setPostalCode(01212010);
        address.setState("São Paulo");
        address.setCity("São Paulo");
        address.setDistrict("Algum bairro");
        address.setAddress("Alguma rua");
        address.setNumber(123);
        address.setAdjunct("Algum complemento");
        logger.info("Testing Register");
        boolean registered = addressDAO.register(address);
        logger.info("Registered: " + registered);
        assertTrue(registered);
        int lastId = addressDAO.getLastId();
        logger.info("LastId: " + lastId);
        logger.info("Testing getOne");
        Address addressRegistered = addressDAO.getOne(lastId);
        boolean correct = addressRegistered.getState().equals(address.getState());
        assertTrue(correct);
        logger.info("Testing getAll");
        List<Address> addressList = addressDAO.getAll();
        assertTrue(addressList.get(addressList.size() - 1).equals(addressRegistered));
        addressRegistered.setPostalCode(01212010);
        addressRegistered.setState("AMAPA");
        addressRegistered.setCity("Teste");
        addressRegistered.setDistrict("Teste");
        addressRegistered.setAddress("Teste");
        addressRegistered.setNumber(456);
        addressRegistered.setAdjunct("Teste");
        logger.info("Testing Update");
        addressDAO.update(addressRegistered);
        assertTrue(addressDAO.getOne(lastId).getState().equals("AMAPA"));
        logger.info("Testing Delete");
        addressDAO.delete(addressRegistered.getId());
        assertTrue(addressDAO.getOne(lastId) == null);

    }
}
