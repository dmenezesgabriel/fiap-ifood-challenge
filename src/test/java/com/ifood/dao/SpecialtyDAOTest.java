package com.ifood.dao;

import static org.junit.Assert.assertTrue;

import com.ifood.entity.Specialty;
import com.ifood.factory.DAOFactory;

import org.junit.Test;

public class SpecialtyDAOTest {

    @Test
    public void shouldAnswerWithTrue() {
        SpecialtyDAO specialtyDAO = (DAOFactory.getDAOFactory(DAOFactory.ORACLE).getSpecialtyDAO());
        Specialty specialty = new Specialty();
        specialty.setName("Marmita");
        System.out.println(specialty);
        specialtyDAO.register(specialty);
        // Specialty lastRegistered = specialtyDAO.getOne(specialtyDAO.getLastId());
    }
}
