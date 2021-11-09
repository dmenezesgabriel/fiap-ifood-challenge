package com.ifood.dao;

/**
* Contact Data Access Object
* @author Gabriel Menezes
* @version 1.0
*/
import java.util.List;

import com.ifood.entity.Contact;

public interface ContactDAO {
    boolean register(Contact contact);

    List<Contact> getAll();

    Contact getOne(int id);

    boolean update(Contact contact);

    boolean delete(int id);

    int getLastId();
}