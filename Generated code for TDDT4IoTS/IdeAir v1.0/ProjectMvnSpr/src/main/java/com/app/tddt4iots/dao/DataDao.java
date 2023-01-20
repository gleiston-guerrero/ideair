package com.app.tddt4iots.dao;
 
 import com.app.tddt4iots.entities.Data_;
 import org.springframework.data.jpa.repository.JpaRepository;
 
 public interface DataDao extends JpaRepository<Data_, Long> {
 }
