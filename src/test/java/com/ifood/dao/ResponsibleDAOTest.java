package com.ifood.dao;

import java.util.List;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;

import com.ifood.entity.Responsible;
import com.ifood.factory.DAOFactory;

import org.junit.Test;

public class ResponsibleDAOTest {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    @Test
    public void shouldAnswerWithTrue() {
        logger.info("Testing Responsible DAO Class");
        ResponsibleDAO responsibleDAO = (DAOFactory.getDAOFactory(DAOFactory.ORACLE).getResponsibleDAO());
        Responsible responsible = new Responsible();
        responsible.setName("João");
        responsible.setCpf(9879879898L);
        responsible.setRg(98987999L);
        logger.info("Testing Register");
        boolean registered = responsibleDAO.register(responsible);
        logger.info("Registered: " + registered);
        assertTrue(registered);
        int lastId = responsibleDAO.getLastId();
        logger.info("LastId: " + lastId);
        logger.info("Testing getOne");
        Responsible responsibleRegistered = responsibleDAO.getOne(lastId);
        boolean correct = responsibleRegistered.getName().equals(responsible.getName());
        assertTrue(correct);
        logger.info("Testing getAll");
        List<Responsible> responsibleList = responsibleDAO.getAll();
        assertTrue(responsibleList.get(responsibleList.size() - 1).equals(responsibleRegistered));
        responsibleRegistered.setName("João");
        responsibleRegistered.setCpf(9879879898L);
        responsibleRegistered.setRg(98987999);
        logger.info("Testing Update");
        responsibleDAO.update(responsibleRegistered);
        assertTrue(responsibleDAO.getOne(lastId).getName().equals("João"));
        logger.info("Testing Delete");
        responsibleDAO.delete(responsibleRegistered.getId());
        assertTrue(responsibleDAO.getOne(lastId) == null);

    }
}
