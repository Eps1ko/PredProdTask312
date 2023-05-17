package com.crudapp.boot.predprodtask312.service;



import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);
}
