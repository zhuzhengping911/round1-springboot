package com.zzp.controller;

import com.zzp.service.MybatisService;
import com.zzp.util.ExceptionHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/5/13.
 */
@RestController
@RequestMapping("/mybatis")
public class MybatisController {

    @Autowired
    private MybatisService service;

    @Autowired
    private ExceptionHandle handle;

//    /**
//     * 更新用户信息
//     * @param user_id 用户ID
//     * @param nickName 昵称
//     */
//    @PutMapping("/updateUser/{id}")
//    public Result updateUser(@PathVariable("id") String user_id, @RequestParam("nickName") String nickName){
//        Result result = ResultUtil.success();
//        try {
//            service.updateUser(user_id,nickName);
//        }catch (Exception e){
//            result = handle.exceptionGet(e);
//        }
//        return result;
////        service.updateUser(user_id,nickName);
//    }
//
//    /**
//     * 获取用户信息
//     * @param id 用户Id
//     * @return
//     */
//    @GetMapping("/getUser/{id}")
//    public Result getUser(@PathVariable("id")  Integer id){
//        Result result = ResultUtil.success();
//        try {
//            result.setData(service.getUser(id));
//        }catch (Exception e){
//            result = handle.exceptionGet(e);
//        }
//        return result;
////        return service.getUser(id);
//    }
//
//    /**
//     * 删除用户
//     * @param tel
//     */
//    @DeleteMapping("/deleteUserByUserId/{tel}")
//    public Result deleteUserByUserId(@PathVariable("tel")  String tel){
//        Result result = ResultUtil.success();
//        try {
//            UserInfo user  = new UserInfo();
//            user.setTel(tel);
//            service.deleteUserByUserId(user);
//        }catch (Exception e){
//            result = handle.exceptionGet(e);
//        }
//        return result;
////        UserInfo user  = new UserInfo();
////        user.setTel(tel);
////        service.deleteUserByUserId(user);
//    }
//
//    /**
//     * 使用@RequestBody获取参数，用map类型接收，再取出
//     * @param reqMap
//     */
//    @PostMapping("/createUserByMap")
//    public Result createUserByMap(@RequestBody Map<String,Object> reqMap){
//        Result result = ResultUtil.success();
//        try {
//            service.createUser(reqMap);
//        }catch (Exception e){
//            result = handle.exceptionGet(e);
//        }
//        return result;
////        service.createUser(reqMap);
//    }


}
