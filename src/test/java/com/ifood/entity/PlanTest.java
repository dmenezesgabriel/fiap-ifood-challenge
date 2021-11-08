package com.ifood.entity;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PlanTest {

    @Test
    public void shouldAnswerWithTrue() {
        Plan plan = new Plan();
        plan.setName("Básico");
        plan.setDescription("<h1>Hello</h1>");
        plan.setCommission(0.12);
        plan.setTax(0.035);
        plan.setPrice(100);
        assertTrue(plan.getName() == "Básico");
        assertTrue(plan.getDescription() == "<h1>Hello</h1>");
        assertTrue(plan.getCommission() == 0.12);
        assertTrue(plan.getTax() == 0.035);
        assertTrue(plan.getPrice() == 100);
    }
}
