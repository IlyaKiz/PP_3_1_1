package com.example.pp_3_1_1.services;

import com.example.pp_3_1_1.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(User user);

    List<User> listUsers();

    User getUserById(long id);

    void deleteUserById(long id);


}
