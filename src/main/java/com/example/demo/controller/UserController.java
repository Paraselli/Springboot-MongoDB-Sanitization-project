package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.SanitizerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        // Sanitize input
        user.setUsername(SanitizerUtil.sanitize(user.getUsername()));
        return repository.save(user);
    }

    @GetMapping
    public List<User> getAll() {
        return repository.findAll();
    }
}
