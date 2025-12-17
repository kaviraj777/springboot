package com.kavi.learn.service;

import java.util.List;
import com.kavi.learn.model.User;

public interface UserService {
   // CRUD
   User createUser(User user);

   List<User> getAllUsers();

   User updateUserById(Long id, User user);

   void deleteUserById(Long id);

}