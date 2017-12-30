package com.chumo.user.controller;

import com.chumo.user.entity.User;
import com.chumo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String user(){
        User user = new User();
        user.setMobile("123131313");
        user.setUsername("admin");
        user.setPassword("admin");
        user.setRealName("ylj");
        userService.createUser(user);
        return "user";
    }
}
