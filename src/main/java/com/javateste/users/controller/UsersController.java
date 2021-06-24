package com.javateste.users.controller;

import com.javateste.users.entity.User;
import com.javateste.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
       return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @PostMapping("/list")
    public ResponseEntity<List<User>> createListUsers(@RequestBody List<User> users) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createListUsers(users));
    }

    @GetMapping
    public ResponseEntity<List<User>> allUsers() {
       return ResponseEntity.ok(userService.getAllUsers());
    }
}
