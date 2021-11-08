package com.ifood.entity;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ContactTest {

    @Test
    public void shouldAnswerWithTrue() {
        Contact contact = new Contact();
        contact.setName("Gabriel");
        contact.setEmail("example@example.com");
        contact.setPhone(11987654321L);
        assertTrue(contact.getName() == "Gabriel");
        assertTrue(contact.getEmail() == "example@example.com");
        assertTrue(contact.getPhone() == 11987654321L);
    }
}
