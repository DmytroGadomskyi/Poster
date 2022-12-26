package com.poster.sevice;

import com.poster.entities.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(String uuid);

    User getAuthenticatedUser();

    User saveToDB(User user);

    void delete(User user);

    User getByUsername(String username);
}
