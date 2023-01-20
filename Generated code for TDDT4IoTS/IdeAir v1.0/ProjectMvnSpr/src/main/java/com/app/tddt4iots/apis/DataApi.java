package com.app.tddt4iots.apis;

import com.app.tddt4iots.entities.Data_;
import com.app.tddt4iots.dao.DataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/data")
public class DataApi {

    @Autowired
    private DataDao dataDAO;

    @GetMapping
    public ResponseEntity<List<Data_>> getData() {
        List<Data_> listData = dataDAO.findAll();
        return ResponseEntity.ok(listData);
    }

    @PostMapping
    public ResponseEntity<Data_> insertData(@RequestBody Data_ data) {
        Data_ newData = dataDAO.save(data);
        return ResponseEntity.ok(newData);
    }

    @PutMapping
    public ResponseEntity<Data_> updateData(@RequestBody Data_ data) {
        Data_ upData = dataDAO.save(data);
        if (upData != null) {
            return ResponseEntity.ok(upData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Data_> deletePersons(@PathVariable("id") Long id) {
        dataDAO.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
