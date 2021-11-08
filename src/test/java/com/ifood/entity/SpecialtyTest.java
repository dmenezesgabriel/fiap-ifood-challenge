package com.ifood.entity;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SpecialtyTest {

    @Test
    public void shouldAnswerWithTrue() {
        Specialty specialty = new Specialty();
        specialty.setName("Marmita");
        assertTrue(specialty.getName() == "Marmita");
    }
}
