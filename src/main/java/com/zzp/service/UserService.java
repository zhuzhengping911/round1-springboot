package com.zzp.service;

import com.zzp.dao.UserInfoMapper;
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
}
