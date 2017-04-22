package com.zzp.service;

import com.zzp.dao.UserInfoMapper;
import com.zzp.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@Service
public class UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public void createUser(String tel,String pwd) {
        userInfoMapper.createUser(tel,pwd);
    }

    public UserInfo getUser(Integer id) {
        return userInfoMapper.getUser(id);
    }

    public void updateUser(String user_id, String nickName) {
        userInfoMapper.updateUser(user_id,nickName);
    }

    public void deleteUserByUserId(Integer id) {
        userInfoMapper.deleteUserByUserId(id);
    }
}
