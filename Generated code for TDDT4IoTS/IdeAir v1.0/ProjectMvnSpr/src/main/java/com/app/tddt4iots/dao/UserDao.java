package com.app.tddt4iots.dao;
 
 import com.app.tddt4iots.entities.User;
 import org.springframework.data.jpa.repository.JpaRepository;
 
 public interface UserDao extends JpaRepository<User, Long> {
 }
