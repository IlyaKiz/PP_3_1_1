package com.example.pp_3_1_1.dao;


import com.example.pp_3_1_1.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Repository
@Transactional
public class UserDaoImp implements UserDao {



   @PersistenceContext
   private EntityManager entityManager;

   @Override
   @SuppressWarnings("uncheked")
   public List<User> getAllUsers() {
      String jpql = "SELECT c FROM User c";
      Query query = entityManager.createQuery(jpql, User.class);
      return query.getResultList();
   }

   @Override
   public void addUser(User user) {
      entityManager.persist(user);
   }

   @Override
   public void deleteUser(Long id) {
      entityManager.remove(entityManager.find(User.class, id));
   }

   @Override
   public void updateUser(User user) {
      entityManager.merge(user);
   }

   @Override
   public User getUserById(Long id) {
      return entityManager.find(User.class, id);
   }



}
