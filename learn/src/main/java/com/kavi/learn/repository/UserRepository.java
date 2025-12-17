package com.kavi.learn.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kavi.learn.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
