package com.fullstackbd.tahsin.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstackbd.tahsin.backend.entity.Users;
import com.fullstackbd.tahsin.backend.model.Message;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Users user) {
        // TODO: Sign Up Service Needs To Be Handled
        return ResponseEntity.status(202).body(
            Message.
            builder().
            message("Successfully Added User").
            result(true).
            statusCode(202).
            build()
        );
        // return ResponseEntity.status(400).body(
        //     Message.
        //     builder().
        //     message("Could Not Add User").
        //     result(false).
        //     statusCode(400).
        //     build()
        // );
    }
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody Users user) {
        // TODO: Sign In Service Needs To Be Handled
        return ResponseEntity.status(202).body(
            Message.
            builder().
            message("Successfully Signed In User").
            result(true).
            statusCode(202)
        );
        // return ResponseEntity.status(400).body(
        //     Message.
        //     builder().
        //     message("The Credential didn't Match").
        //     result(false).
        //     statusCode(400)
        // );
    }
}
