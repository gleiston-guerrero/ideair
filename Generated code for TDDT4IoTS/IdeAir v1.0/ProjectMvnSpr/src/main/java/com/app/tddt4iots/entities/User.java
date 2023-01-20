package com.app.tddt4iots.entities;
 
import lombok.Data;
 import lombok.NoArgsConstructor;
 
import javax.persistence.*;
 import java.util.ArrayList;
 
@Entity
 @Table(name = "User")
 @Data
 @NoArgsConstructor
 public class User {
     
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     
    @Column(name = "name", nullable = false, unique = false, length = 30) 
    private String name; 
 
    @Column(name = "username", nullable = false, unique = false, length = 30) 
    private String username; 
 
    @Column(name = "password", nullable = false, unique = false, length = 30) 
    private String password; 
 
   @OneToMany(mappedBy = "id") 
    private ArrayList<Home> Home; 
 
    
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "com.app.tddt4iots.entities.User[ id=" + id + " ]";
    }
}    
