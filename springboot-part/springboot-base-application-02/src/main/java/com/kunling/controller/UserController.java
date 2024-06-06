package com.kunling.controller;

import com.kunling.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private User user;

    @RequestMapping("show")
    public User show() {
        return user;
    }
}
