package com.ifood.entity;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StoreTest {

    @Test
    public void shouldAnswerWithTrue() {
        // Contact Instance
        Contact contact = new Contact();
        contact.setName("Gabriel");
        contact.setEmail("example@example.com");
        contact.setPhone(11987654321L);

        // Address Instance
        Address address = new Address();
        address.setPostalCode(01212010);
        address.setState("São Paulo");
        address.setCity("São Paulo");
        address.setDistrict("Algum bairro");
        address.setAddress("Alguma rua");
        address.setNumber(123);
        address.setAdjunct("Algum complemento");

        // Responsible Instance
        Responsible responsible = new Responsible();
        responsible.setName("Gabriel");
        responsible.setCpf(12312312312L);
        responsible.setRg(12123123);

        // Speciality Instance
        Specialty specialty = new Specialty();
        specialty.setName("Marmita");

        // Plan Instance
        Plan plan = new Plan();
        plan.setName("Básico");
        plan.setCommission(0.12);
        plan.setTax(0.035);
        plan.setPrice(100);

        Store store = new Store();
        store.setName("Marmitas do Gabriel");
        store.setCompanyName("Gabriel Alimentos LTDA");
        store.setCnpj(12123123123412L);
        store.setPhone(1198765432);
        store.setSpecialty(specialty);
        store.setContact(contact);
        store.setAddress(address);
        store.setResponsible(responsible);
        store.setPlan(plan);
        assertTrue(store.getName() == "Marmitas do Gabriel");
        assertTrue(store.getCompanyName() == "Gabriel Alimentos LTDA");
        assertTrue(store.getCnpj() == 12123123123412L);
        assertTrue(store.getPhone() == 1198765432L);
        assertTrue(specialty.equals(store.getSpecialty()));
        assertTrue(contact.equals(store.getContact()));
        assertTrue(address.equals(store.getAddress()));
        assertTrue(responsible.equals(store.getResponsible()));
        assertTrue(plan.equals(store.getPlan()));
    }
}