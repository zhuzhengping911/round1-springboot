package com.zzp.controller;

import com.zzp.pojo.UserInfo;
import com.zzp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * @param tel 注册手机号
     * @param pwd 设置密码
     */
    @PostMapping("/createUser")
    public void createUser(@RequestParam("tel") String tel, @RequestParam("pwd") String pwd){
        userService.createUser(tel,pwd);
    }

    /**
     * 更新用户信息
     * @param user_id 用户ID
     * @param nickName 昵称
     */
    @PutMapping("/updateUser/{id}")
    public void updateUser(@PathVariable("id") String user_id, @RequestParam("nickName") String nickName){
        userService.updateUser(user_id,nickName);
    }

    /**
     * 获取用户信息
     * @param id 用户Id
     * @return
     */
    @GetMapping("/getUser/{id}")
    public UserInfo getUser(@PathVariable("id")  Integer id){
        return userService.getUser(id);
    }

    @DeleteMapping("/deleteUserByUserId/{id}")
    public void deleteUserByUserId(@PathVariable("id")  Integer id){
        userService.deleteUserByUserId(id);
    }

    @PostMapping("/createUserByMap")
    public void createUserByMap(@RequestBody Map<String,Object> reqMap){
        String tel = reqMap.get("tel").toString();
        String pwd = reqMap.get("pwd").toString();
        userService.createUser(tel,pwd);
    }
}
