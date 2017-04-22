package com.zzp.controller;

import com.zzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public void createUser(@RequestParam String tel, @RequestParam String pwd){
        userService.createUser(tel,pwd);
    }
}
