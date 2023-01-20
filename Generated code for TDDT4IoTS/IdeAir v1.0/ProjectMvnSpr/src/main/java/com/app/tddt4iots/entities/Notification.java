package com.app.tddt4iots.entities;
 
import lombok.Data;
 import lombok.NoArgsConstructor;
 
import javax.persistence.*;
 import java.util.ArrayList;
 
@Entity
 @Table(name = "Notification")
 @Data
 @NoArgsConstructor
 public class Notification {
     
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(name = "alert", nullable = false, unique = false, length = 30) 
    private String alert; 
 
    @Column(name = "date", nullable = false, unique = false, length = 30) 
    private String date; 
 
   @OneToMany(mappedBy = "id") 
    private ArrayList<Data> data ; 
 
    
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
        if (!(object instanceof Notification)) {
            return false;
        }
        Notification other = (Notification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.app.tddt4iots.entities.Notification[ id=" + id + " ]";
    }
}    
