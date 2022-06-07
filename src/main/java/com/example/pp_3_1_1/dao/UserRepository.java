package com.example.pp_3_1_1.dao;
import com.example.pp_3_1_1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByFirstName(String firstName);

}
