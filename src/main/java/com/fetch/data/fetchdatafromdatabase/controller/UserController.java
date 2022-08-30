package com.fetch.data.fetchdatafromdatabase.controller;

import com.fetch.data.fetchdatafromdatabase.model.User;
import com.fetch.data.fetchdatafromdatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "getUserData")
    public List<User> getUserData() {
        return userService.getAllUsers();
    }
}
