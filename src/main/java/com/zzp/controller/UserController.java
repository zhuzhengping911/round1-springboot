package com.zzp.controller;

import com.zzp.pojo.UserInfo;
import com.zzp.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by zhuzhengping on 2017/4/22.
 * 使用mybatis或jpa等orm框架后，jdbc链接将被取代
 * 切勿在代码中使用两种链接方法
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
    @ApiOperation(value = "创建用户",notes = "使用手机以及密码初始化用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "tel",value = "用户手机号",required = true,dataType = "String"),
            @ApiImplicitParam(name = "pwd",value = "用户初始密码",required = true,dataType = "String")
    })
    @PostMapping("/createUser")
    public void createUser(@RequestParam("tel") String tel, @RequestParam("pwd") String pwd){
        userService.createUser(tel,pwd);
    }

    /**
     * 添加用户2
     * @param userInfo
     * @Valid添加表单验证，BindingResult获取验证结果
     */
    @ApiOperation(value = "创建用户V2版本",notes = "使用UserInfo对象初始化用户信息")
    @ApiImplicitParam(name = "userInfo",value = "用户对象",required = true,dataType = "UserInfo")
    @PostMapping("/createUser2")
    public String createUser2(@Valid UserInfo userInfo, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        userService.createUser(userInfo.getTel(),userInfo.getPassWord());
        return "OK";
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

    /**
     * 删除用户
     * @param id
     */
    @DeleteMapping("/deleteUserByUserId/{id}")
    public void deleteUserByUserId(@PathVariable("id")  Integer id){
        userService.deleteUserByUserId(id);
    }

    /**
     * 使用@RequestBody获取参数，用map类型接收，再取出
     * @param reqMap
     */
    @PostMapping("/createUserByMap")
    public void createUserByMap(@RequestBody Map<String,Object> reqMap){
        String tel = reqMap.get("tel").toString();
        String pwd = reqMap.get("pwd").toString();
        userService.createUser(tel,pwd);
    }
}
