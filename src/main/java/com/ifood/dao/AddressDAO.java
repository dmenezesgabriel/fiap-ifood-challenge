package com.ifood.dao;

/**
* Address Data Access Object
* @author Gabriel Menezes
* @version 1.0
*/
import java.util.List;

import com.ifood.entity.Address;

public interface AddressDAO {
    boolean register(Address address);

    List<Address> getAll();

    Address getOne(int id);

    boolean update(Address address);

    boolean delete(int id);
}