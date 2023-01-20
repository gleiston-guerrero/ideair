package com.app.tddt4iots.dao;
 
 import com.app.tddt4iots.entities.Home;
 import org.springframework.data.jpa.repository.JpaRepository;
 
 public interface HomeDao extends JpaRepository<Home, Long> {
 }
