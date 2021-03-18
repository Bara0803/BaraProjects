package org.example.rwitter.service;



import org.example.rwitter.model.User;

import java.util.List;

public interface UserService {

    void createUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    List<User> getAllUsers();
}
