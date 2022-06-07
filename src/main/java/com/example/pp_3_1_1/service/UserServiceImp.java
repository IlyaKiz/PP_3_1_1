package com.example.pp_3_1_1.service;
import com.example.pp_3_1_1.dao.UserRepository;
import com.example.pp_3_1_1.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImp implements UserService {

   @Autowired
   private UserRepository userRepository;

   @Override
   public List<User> getAllUsers() {
      return userRepository.findAll();
   }

   @Override
   public void addUser(User user) {
      userRepository.save(user);
   }

   @Override
   public void deleteUser(Long id) {
      userRepository.deleteById(id);
   }

   @Override
   public void updateUser(User user) {
      userRepository.save(user);
   }

   @Override
   public User getUserById(Long id) {
      User user = null;
      Optional<User> optional = userRepository.findById(id);
      if (optional.isPresent()) {
         user = optional.get();
      }
      return user;
   }

   @Override
   public List<User> findAllByFirstName(String firstName) {
      List<User> user = userRepository.findAllByFirstName(firstName);
      return user;
   }


}






