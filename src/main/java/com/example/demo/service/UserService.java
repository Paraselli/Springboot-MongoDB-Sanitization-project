package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.SanitizerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        if (user.getName() != null) {
            user.setName(SanitizerUtil.sanitize(user.getName()));
        }
        if (user.getUsername() != null) {
            user.setUsername(SanitizerUtil.sanitize(user.getUsername()));
        }
        if (user.getEmail() != null) {
            user.setEmail(SanitizerUtil.sanitize(user.getEmail()));
        }
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
