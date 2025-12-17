package com.kavi.learn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kavi.learn.model.User;
import com.kavi.learn.repository.UserRepository;
import com.kavi.learn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUserById(Long id, User user) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User isUser = existingUser.get();
            isUser.setName(user.getName());
            isUser.setEmail(user.getEmail());
            isUser.setPassword(user.getPassword());
            isUser.setRole(user.getRole());
            return userRepository.save(isUser);
        }
        return null;
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
