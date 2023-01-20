package com.app.tddt4iots.apis;

import com.app.tddt4iots.entities.Notification;
import com.app.tddt4iots.dao.NotificationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notification")
public class NotificationApi {

    @Autowired
    private NotificationDao notificationDAO;

    @GetMapping
    public ResponseEntity<List<Notification>> getNotification() {
        List<Notification> listNotification = notificationDAO.findAll();
        return ResponseEntity.ok(listNotification);
    }

    @PostMapping
    public ResponseEntity<Notification> insertNotification(@RequestBody Notification notification) {
        Notification newNotification = notificationDAO.save(notification);
        return ResponseEntity.ok(newNotification);
    }

    @PutMapping
    public ResponseEntity<Notification> updateNotification(@RequestBody Notification notification) {
        Notification upNotification = notificationDAO.save(notification);
        if (upNotification != null) {
            return ResponseEntity.ok(upNotification);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Notification> deletePersons(@PathVariable("id") Long id) {
        notificationDAO.deleteById(id);
        return ResponseEntity.ok(null);
    }

}
