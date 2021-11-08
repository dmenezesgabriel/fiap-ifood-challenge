package com.ifood.dao;

/**
* User Data Access Object
* @author Gabriel Menezes
* @version 1.0
*/
import java.util.List;

import com.ifood.entity.User;

public interface UserDAO {
    boolean register(User user);

    List<User> getAll();

    User getOne(int id);

    User getOneEmail(String email);

    boolean update(User user);

    boolean delete(int id);
}