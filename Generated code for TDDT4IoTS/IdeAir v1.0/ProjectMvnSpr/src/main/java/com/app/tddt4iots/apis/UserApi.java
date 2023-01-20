package com.app.tddt4iots.apis;

import com.app.tddt4iots.entities.User;
import com.app.tddt4iots.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserDao userDAO;

    @GetMapping
    public ResponseEntity<List<User>> getUser() {
        List<User> listUser = userDAO.findAll();
        return ResponseEntity.ok(listUser);
    }

    @PostMapping
    public ResponseEntity<User> insertUser(@RequestBody User user) {
        User newUser = userDAO.save(user);
        return ResponseEntity.ok(newUser);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User upUser = userDAO.save(user);
        if (upUser != null) {
            return ResponseEntity.ok(upUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<User> deletePersons(@PathVariable("id") Long id) {
        userDAO.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
