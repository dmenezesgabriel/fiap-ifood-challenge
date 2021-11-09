package com.ifood.dao;

/**
* Specialty Data Access Object
* @author Gabriel Menezes
* @version 1.0
*/
import java.util.List;

import com.ifood.entity.Specialty;

public interface SpecialtyDAO {
    boolean register(Specialty specialty);

    List<Specialty> getAll();

    Specialty getOne(int id);

    boolean update(Specialty specialty);

    boolean delete(int id);

    int getLastId();
}