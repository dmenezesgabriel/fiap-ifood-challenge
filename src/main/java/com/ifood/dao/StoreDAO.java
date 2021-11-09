package com.ifood.dao;

/**
* Store Data Access Object
* @author Gabriel Menezes
* @version 1.0
*/
import java.util.List;

import com.ifood.entity.Store;

public interface StoreDAO {
    boolean register(Store store);

    List<Store> getAll();

    Store getOne(int id);

    boolean update(Store store);

    boolean delete(int id);

    int getLastId();
}