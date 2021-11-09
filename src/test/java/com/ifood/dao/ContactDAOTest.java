package com.ifood.dao;

import java.util.List;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;

import com.ifood.entity.Contact;
import com.ifood.factory.DAOFactory;

import org.junit.Test;

public class ContactDAOTest {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    @Test
    public void shouldAnswerWithTrue() {
        logger.info("Testing Contact DAO Class");
        ContactDAO contactDAO = (DAOFactory.getDAOFactory(DAOFactory.ORACLE).getContactDAO());
        Contact contact = new Contact();
        contact.setName("Gabriel");
        contact.setEmail("example@example.com");
        contact.setPhone(11987654321L);
        logger.info("Testing Register");
        boolean registered = contactDAO.register(contact);
        logger.info("Registered: " + registered);
        assertTrue(registered);
        int lastId = contactDAO.getLastId();
        logger.info("LastId: " + lastId);
        logger.info("Testing getOne");
        Contact contactRegistered = contactDAO.getOne(lastId);
        boolean correct = contactRegistered.getName().equals(contact.getName());
        assertTrue(correct);
        logger.info("Testing getAll");
        List<Contact> contactList = contactDAO.getAll();
        logger.info("" + contactDAO.getAll());
        assertTrue(contactList.get(contactList.size() - 1).equals(contactRegistered));
        contactRegistered.setName("José");
        contactRegistered.setEmail("replace@example.com");
        contactRegistered.setPhone(11123456789L);
        logger.info("Testing Update");
        contactDAO.update(contactRegistered);
        assertTrue(contactDAO.getOne(lastId).getName().equals("José"));
        logger.info("Testing Delete");
        contactDAO.delete(contactRegistered.getId());
        assertTrue(contactDAO.getOne(lastId) == null);

    }
}
