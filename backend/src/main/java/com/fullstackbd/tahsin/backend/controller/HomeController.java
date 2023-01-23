package com.fullstackbd.tahsin.backend.controller;

import com.fullstackbd.tahsin.backend.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<?> home() {
        return ResponseEntity.status(202).body(
            Message.
            builder().
            message("Welcome To This Backend API").
            result(true).
            statusCode(202).
            build()
        );
    }
}
