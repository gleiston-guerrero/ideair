package com.app.tddt4iots.dao;
 
 import com.app.tddt4iots.entities.Device;
 import org.springframework.data.jpa.repository.JpaRepository;
 
 public interface DeviceDao extends JpaRepository<Device, Long> {
 }
