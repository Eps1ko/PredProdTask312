package crudApp.dao;

import crudApp.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    void removeUser(Long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);
}
