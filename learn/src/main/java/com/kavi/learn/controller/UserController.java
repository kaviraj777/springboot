package com.kavi.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kavi.learn.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<user> saveUser(@ResponseBody User user){
        User  newUser =userService.createUser(user);
        return ResponseEntity.status(201).body(newUser);
    }

    @GetMapping("/all")
    public ResponseEntity<List<user>> getAllUser(){
        List<user> user=userService.getAllUsers();
        return ResponseEntity.status(200).body(users);

    }
}
