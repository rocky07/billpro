package com.ff.billpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ff.billpro.repo.User;
import com.ff.billpro.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/user")
    public List<User> userlist(){
        return userService.findAll();
    }
    @PostMapping("/user")
    public void saveUser(User user){
        userService.save(user);
    }
    @PutMapping("/user")
    public void updateUser(User user){
        userService.save(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestParam Integer userId){
        userService.deleteById(userId);
    }

}
