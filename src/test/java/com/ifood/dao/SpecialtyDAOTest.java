package com.ifood.dao;

import java.util.List;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;

import com.ifood.entity.Specialty;
import com.ifood.factory.DAOFactory;

import org.junit.Test;

public class SpecialtyDAOTest {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    @Test
    public void shouldAnswerWithTrue() {
        logger.info("Testing Speciality DAO Class");
        SpecialtyDAO specialtyDAO = (DAOFactory.getDAOFactory(DAOFactory.ORACLE).getSpecialtyDAO());
        Specialty specialty = new Specialty();
        specialty.setName("Marmita");
        logger.info("Testing Register");
        boolean registered = specialtyDAO.register(specialty);
        logger.info("Registered: " + registered);
        assertTrue(registered);
        int lastId = specialtyDAO.getLastId();
        logger.info("LastId: " + lastId);
        logger.info("Testing getOne");
        Specialty specialtyRegistered = specialtyDAO.getOne(lastId);
        boolean correct = specialtyRegistered.getName().equals(specialty.getName());
        assertTrue(correct);
        logger.info("Testing getAll");
        List<Specialty> specialtyList = specialtyDAO.getAll();
        assertTrue(specialtyList.get(specialtyList.size() - 1).equals(specialtyRegistered));
        specialtyRegistered.setName("Brasileira");
        logger.info("Testing Update");
        specialtyDAO.update(specialtyRegistered);
        assertTrue(specialtyDAO.getOne(lastId).getName().equals("Brasileira"));
        logger.info("Testing Delete");
        specialtyDAO.delete(specialtyRegistered.getId());
        assertTrue(specialtyDAO.getOne(lastId) == null);

    }
}
