package com.example.pp_3_1_1.service;
import com.example.pp_3_1_1.models.User;
import java.util.List;

public interface UserService {



    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User getUserById(Long id);



}
