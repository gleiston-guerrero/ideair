package com.app.tddt4iots.entities;

import lombok.Data;
 import lombok.NoArgsConstructor;
 
import javax.persistence.*;
 import java.util.ArrayList;
import java.util.ArrayList;
 
@Entity
 @Table(name = "Data")
 @Data
 @NoArgsConstructor
 public class Data_ {
     
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(name = "co", nullable = false, unique = false) 
    private Double co; 
 
    @Column(name = "co2", nullable = false, unique = false) 
    private Double co2; 
 
    @Column(name = "c6h6", nullable = false, unique = false) 
    private Double c6h6; 
 
    @Column(name = "no2", nullable = false, unique = false) 
    private Double no2; 
 
    @Column(name = "nh3", nullable = false, unique = false, length = 30) 
    private String nh3; 
 
   @OneToMany(mappedBy = "id") 
    private ArrayList<Device> device ; 
 
   @OneToMany(mappedBy = "id") 
    private ArrayList<Notification> Notification; 
 
    
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
        if (!(object instanceof Data)) {
            return false;
        }
        Data_ other = (Data_) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.app.tddt4iots.entities.Data[ id=" + id + " ]";
    }
}    
