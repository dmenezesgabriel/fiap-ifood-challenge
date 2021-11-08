package com.ifood.dao;

/**
* Plan Data Access Object
* @author Gabriel Menezes
* @version 1.0
*/
import java.util.List;

import com.ifood.entity.Plan;

public interface PlanDAO {
    boolean register(Plan plan);

    List<Plan> getAll();

    Plan getOne(int id);

    boolean update(Plan plan);

    boolean delete(int id);
}