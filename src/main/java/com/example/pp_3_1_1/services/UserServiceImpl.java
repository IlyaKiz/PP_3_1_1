package com.example.pp_3_1_1.services;
import com.example.pp_3_1_1.dao.UserRepository;
import com.example.pp_3_1_1.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Transactional
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }


    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }


    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }


    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    }
