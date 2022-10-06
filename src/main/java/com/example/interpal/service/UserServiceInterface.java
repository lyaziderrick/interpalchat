package com.example.interpal.service;

import com.example.interpal.model.User;

import java.util.List;
import java.util.Optional;

public abstract class UserServiceInterface {
    abstract List<User> findByNameEndsWith(String password);
}
