package com.kavi.learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")

public class User {
    @Id
    private int id;
    @Column(name="user_name")
    private String name;
    @Column(name="user_email")
    private String email;
    @Column(name="user_password")
    private String password;
    @Column(name="user_role")
    private String role;
    
    public User(){

    }
    
   

    public User(int id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }



    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }



    public String getRole() {
        return role;
    }



    public void setId(int id) {
        this.id = id;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public void setPassword(String password) {
        this.password = password;
    }



    public void setRole(String role) {
        this.role = role;
    }

    

}
