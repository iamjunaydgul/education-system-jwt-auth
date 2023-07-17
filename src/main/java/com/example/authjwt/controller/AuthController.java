package com.example.authjwt.controller;

import com.example.authjwt.model.User;
import com.example.authjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){

        System.out.println("getting users");
        return this.userService.getUsers();
    }
}
