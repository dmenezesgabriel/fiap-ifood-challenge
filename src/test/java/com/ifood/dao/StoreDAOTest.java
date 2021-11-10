package com.ifood.dao;

import java.util.List;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;

import com.ifood.entity.Address;
import com.ifood.entity.Contact;
import com.ifood.entity.Plan;
import com.ifood.entity.Responsible;
import com.ifood.entity.Specialty;
import com.ifood.entity.Store;
import com.ifood.factory.DAOFactory;

import org.junit.Test;

public class StoreDAOTest {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    @Test
    public void shouldAnswerWithTrue() {
        logger.info("Testing Speciality DAO Class");
        StoreDAO storeDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getStoreDAO());
        ContactDAO contactDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getContactDAO());
        AddressDAO addressDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getAddressDAO());
        ResponsibleDAO responsibleDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getResponsibleDAO());
        SpecialtyDAO specialtyDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getSpecialtyDAO());
        PlanDAO planDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getPlanDAO());

        // Contact Instance
        Contact contact = new Contact();
        contact.setName("Gabriel");
        contact.setEmail("example@example.com");
        contact.setPhone(11987654321L);
        contactDAO.register(contact);
        Contact contactRegistered = contactDAO.getOne(contactDAO.getLastId());

        // Address Instance
        Address address = new Address();
        address.setPostalCode(01212010);
        address.setState("São Paulo");
        address.setCity("São Paulo");
        address.setDistrict("Algum bairro");
        address.setAddress("Alguma rua");
        address.setNumber(123);
        address.setAdjunct("Algum complemento");
        addressDAO.register(address);
        Address addressRegistered = addressDAO.getOne(addressDAO.getLastId());

        // Responsible Instance
        Responsible responsible = new Responsible();
        responsible.setName("Gabriel");
        responsible.setCpf(12312312312L);
        responsible.setRg(12123123);
        responsibleDAO.register(responsible);
        Responsible responsibleRegistered = responsibleDAO.getOne(responsibleDAO.getLastId());

        // Speciality Instance
        Specialty specialty = new Specialty();
        specialty.setName("Marmita");
        specialtyDAO.register(specialty);
        Specialty specialtyRegistered = specialtyDAO.getOne(specialtyDAO.getLastId());

        // Plan Instance
        Plan plan = new Plan();
        plan.setName("Básico");
        plan.setDescription("<h1>hello<h1>");
        plan.setCommission(0.12);
        plan.setTax(0.035);
        plan.setPrice(100);
        planDAO.register(plan);
        Plan planRegistered = planDAO.getOne(planDAO.getLastId());

        Store store = new Store();
        store.setName("Marmitas do Gabriel");
        store.setCompanyName("Gabriel Alimentos LTDA");
        store.setCnpj(12123123123412L);
        store.setPhone(11987654321L);
        store.setSpecialty(specialtyRegistered);
        store.setContact(contactRegistered);
        store.setAddress(addressRegistered);
        store.setResponsible(responsibleRegistered);
        store.setPlan(planRegistered);

        logger.info("Testing Register");
        boolean registered = storeDAO.register(store);
        logger.info("Registered: " + registered);
        assertTrue(registered);
        int lastId = storeDAO.getLastId();
        logger.info("LastId: " + lastId);
        logger.info("Testing getOne");
        Store storeRegistered = storeDAO.getOne(lastId);
        boolean correct = storeRegistered.getName().equals(store.getName());
        assertTrue(correct);
        logger.info("Testing getAll");
        List<Store> storeList = storeDAO.getAll();
        assertTrue(storeList.get(storeList.size() - 1).equals(storeRegistered));
        storeRegistered.setName("Novo Nome");
        logger.info("Testing Update");
        storeDAO.update(storeRegistered);
        assertTrue(storeDAO.getOne(lastId).getName().equals("Novo Nome"));
        logger.info("Testing Delete");
        storeDAO.delete(storeRegistered.getId());
        assertTrue(storeDAO.getOne(lastId) == null);

    }
}
