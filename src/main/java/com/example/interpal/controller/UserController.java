package com.example.interpal.controller;

import com.example.interpal.model.User;
import com.example.interpal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
@Autowired
private UserService userService;
@RequestMapping("/password")
public List<User> getUsername(@PathVariable String password){
    return  (List<User>) userService.findByNameEndsWith(password);
}

}
