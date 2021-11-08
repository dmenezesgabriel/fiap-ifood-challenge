package com.ifood.entity;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AddressTest {

    @Test
    public void shouldAnswerWithTrue() {
        Address address = new Address();
        address.setPostalCode(01212010);
        address.setState("São Paulo");
        address.setCity("São Paulo");
        address.setDistrict("Algum bairro");
        address.setAddress("Alguma rua");
        address.setNumber(123);
        address.setAdjunct("Algum complemento");
        assertTrue(address.getPostalCode() == 01212010);
        assertTrue(address.getState() == "São Paulo");
        assertTrue(address.getCity() == "São Paulo");
        assertTrue(address.getDistrict() == "Algum bairro");
        assertTrue(address.getAddress() == "Alguma rua");
        assertTrue(address.getNumber() == 123);
        assertTrue(address.getAdjunct() == "Algum complemento");
    }
}
