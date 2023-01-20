package com.app.tddt4iots.dao;
 
 import com.app.tddt4iots.entities.Notification;
 import org.springframework.data.jpa.repository.JpaRepository;
 
 public interface NotificationDao extends JpaRepository<Notification, Long> {
 }
