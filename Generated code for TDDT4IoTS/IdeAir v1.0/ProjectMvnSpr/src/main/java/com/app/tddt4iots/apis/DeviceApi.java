package com.app.tddt4iots.apis;

import com.app.tddt4iots.entities.Device;
import com.app.tddt4iots.dao.DeviceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/device")
public class DeviceApi {

    @Autowired
    private DeviceDao deviceDAO;

    @GetMapping
    public ResponseEntity<List<Device>> getDevice() {
        List<Device> listDevice = deviceDAO.findAll();
        return ResponseEntity.ok(listDevice);
    }

    @PostMapping
    public ResponseEntity<Device> insertDevice(@RequestBody Device device) {
        Device newDevice = deviceDAO.save(device);
        return ResponseEntity.ok(newDevice);
    }

    @PutMapping
    public ResponseEntity<Device> updateDevice(@RequestBody Device device) {
        Device upDevice = deviceDAO.save(device);
        if (upDevice != null) {
            return ResponseEntity.ok(upDevice);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Device> deletePersons(@PathVariable("id") Long id) {
        deviceDAO.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
