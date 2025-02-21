package com.api.customer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.customer.model.Users;
import com.api.customer.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<Users> validateUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}

