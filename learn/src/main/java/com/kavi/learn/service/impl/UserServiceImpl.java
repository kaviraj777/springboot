package com.kavi.learn.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kavi.learn.model.User;
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
        return userRepository.findAll
    }

    @Override
    public User updateUserById(int id, User user) {
        throw new UnsupportedOperationException("Unimplemented method 'updateUserById'");
    }

    @Override
    public void deletUserById(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'deletUserById'");
    }
    
}
