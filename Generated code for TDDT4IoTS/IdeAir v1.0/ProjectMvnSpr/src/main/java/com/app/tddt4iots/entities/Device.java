package com.app.tddt4iots.entities;
 

import lombok.Data;
 import lombok.NoArgsConstructor;
 
import javax.persistence.*;
 import java.util.ArrayList;
import java.util.ArrayList;
 
@Entity
 @Table(name = "Device")
 @Data
 @NoArgsConstructor
 public class Device {
     
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(name = "name", nullable = false, unique = false, length = 30) 
    private String name; 
 
    @Column(name = "mac", nullable = false, unique = false, length = 30) 
    private String mac; 
 
   @OneToMany(mappedBy = "id") 
    private ArrayList<Home> home ; 
 
   @OneToMany(mappedBy = "id") 
    private ArrayList<Data> Data; 
 
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null ) ? 0 : this.id.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Device)) {
            return false;
        }
        Device other = (Device) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.app.tddt4iots.entities.Device[ id=" + id + " ]";
    }
}    
