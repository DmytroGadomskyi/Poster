package com.poster.sevice.impl;

import com.poster.dao.UserDAO;
import com.poster.entities.User;
import com.poster.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAll() {
        return userDAO.findAll();
    }

    @Override
    public User getById(String uuid) {
        return getById(uuid);
    }

    @Override
    public User getAuthenticatedUser() {
        return null;
    }

    @Override
    public User saveToDB(User user) {
        return userDAO.save(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }

    @Override
    public User getByUsername(String username) {
        return userDAO.findByUserName(username).get();
    }
}
