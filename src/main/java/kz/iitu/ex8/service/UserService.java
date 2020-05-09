package kz.iitu.ex8.service;


import kz.iitu.ex8.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    boolean createUser(User user);
    void updateUser(Long id, User user);
    boolean deleteUser(Long userId);
}
