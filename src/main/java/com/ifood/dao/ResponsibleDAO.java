package com.ifood.dao;

/**
* Responsible Data Access Object
* @author Gabriel Menezes
* @version 1.0
*/
import java.util.List;

import com.ifood.entity.Responsible;

public interface ResponsibleDAO {
    boolean register(Responsible responsible);

    List<Responsible> getAll();

    Responsible getOne(int id);

    boolean update(Responsible responsible);

    boolean delete(int id);
}