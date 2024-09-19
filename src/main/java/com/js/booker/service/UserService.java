package com.js.booker.service;

import com.js.booker.entity.User;
import com.js.booker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User login(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

}

