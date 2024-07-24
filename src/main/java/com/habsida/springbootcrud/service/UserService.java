package com.habsida.springbootcrud.service;

import com.habsida.springbootcrud.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}
