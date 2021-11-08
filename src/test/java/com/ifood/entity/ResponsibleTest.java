package com.ifood.entity;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ResponsibleTest {

    @Test
    public void shouldAnswerWithTrue() {
        Responsible responsible = new Responsible();
        responsible.setName("Gabriel");
        responsible.setCpf(12312312312L);
        responsible.setRg(12123123);
        assertTrue(responsible.getName() == "Gabriel");
        assertTrue(responsible.getCpf() == 12312312312L);
        assertTrue(responsible.getRg() == 12123123);
    }
}