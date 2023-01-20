package com.app.tddt4iots.apis;

import com.app.tddt4iots.entities.Home;
import com.app.tddt4iots.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class HomeApi {

    @Autowired
    private HomeDao homeDAO;

    @GetMapping
    public ResponseEntity<List<Home>> getHome() {
        List<Home> listHome = homeDAO.findAll();
        return ResponseEntity.ok(listHome);
    }

    @PostMapping
    public ResponseEntity<Home> insertHome(@RequestBody Home home) {
        Home newHome = homeDAO.save(home);
        return ResponseEntity.ok(newHome);
    }

    @PutMapping
    public ResponseEntity<Home> updateHome(@RequestBody Home home) {
        Home upHome = homeDAO.save(home);
        if (upHome != null) {
            return ResponseEntity.ok(upHome);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Home> deletePersons(@PathVariable("id") Long id) {
        homeDAO.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
