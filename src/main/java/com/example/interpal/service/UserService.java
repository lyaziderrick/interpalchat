package com.example.interpal.service;

import com.example.interpal.model.User;
import com.example.interpal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService extends UserServiceInterface {
   @Autowired
   UserRepository userRepository;
    @Override
    public List<User> findByNameEndsWith(String password) {
        return userRepository.findByNameEndsWith(password);
    }
}
