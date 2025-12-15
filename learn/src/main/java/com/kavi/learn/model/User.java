package com.kavi.learn.model;

import jakarta.persistence.Entity;

@Entity

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    
}
