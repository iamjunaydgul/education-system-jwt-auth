package com.example.authjwt.service;

import com.example.authjwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> users= new ArrayList<>();

    public UserService(){

        users.add(new User(UUID.randomUUID().toString(), "Junayd", "iamjunaydgul@gmail.com"));
    }

    public List<User> getUsers(){

        return this.users;
    }
}
