package com.peaksoft.springBootBootstrap.service;

import com.peaksoft.springBootBootstrap.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    void update(User user);

    void delete(User user);

    User getById(long id);

    User getUserByUsername(String userName);

    User getUserByEmail(String email);
}
