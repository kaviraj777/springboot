package com.kavi.learn.service;
import java.util.List;
import com.kavi.learn.model.User;

public interface UserService {
   //CRUD
   User createUser(User user);
   List<User> getAllUsers();
   User updateUserById(int id,User user);
   void deletUserById(int id);
    
} 