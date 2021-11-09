package com.ifood.dao;

import java.util.List;
import java.util.logging.Logger;
import static org.junit.Assert.assertTrue;

import com.ifood.entity.Plan;
import com.ifood.factory.DAOFactory;

import org.junit.Test;

public class PlanDAOTest {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    @Test
    public void shouldAnswerWithTrue() {
        logger.info("Testing Speciality DAO Class");
        PlanDAO planDAO = (DAOFactory.getDAOFactory(DAOFactory.ORACLE).getPlanDAO());
        Plan plan = new Plan();
        plan.setName("Básico");
        plan.setDescription("<h1>Hello</h1>");
        plan.setCommission(0.12);
        plan.setTax(0.035);
        plan.setPrice(100.0);
        logger.info("Testing Register");
        boolean registered = planDAO.register(plan);
        logger.info("Registered: " + registered);
        assertTrue(registered);
        int lastId = planDAO.getLastId();
        logger.info("LastId: " + lastId);
        logger.info("Testing getOne");
        Plan planRegistered = planDAO.getOne(lastId);
        boolean correct = planRegistered.getName().equals(plan.getName());
        assertTrue(correct);
        logger.info("Testing getAll");
        List<Plan> planList = planDAO.getAll();
        assertTrue(planList.get(planList.size() - 1).equals(planRegistered));
        planRegistered.setName("Empresarial");
        planRegistered.setDescription("<h1>HelloReplaced</h1>");
        planRegistered.setCommission(0.13);
        planRegistered.setTax(0.036);
        planRegistered.setPrice(101.0);
        logger.info("Testing Update");
        planDAO.update(planRegistered);
        assertTrue(planDAO.getOne(lastId).getName().equals("Empresarial"));
        logger.info("Testing Delete");
        planDAO.delete(planRegistered.getId());
        assertTrue(planDAO.getOne(lastId) == null);

    }
}
