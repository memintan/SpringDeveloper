package com.cybertek.controller;

import com.cybertek.entity.User;
import com.cybertek.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class HomeController {

    private UserRepository userRepository;

    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> readAllUsers(){
        return userRepository.findAll();
    }
}
