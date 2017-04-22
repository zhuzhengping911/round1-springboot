package com.zzp.dao.impl;

import com.zzp.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
@Repository
public class UserInfoImpl implements UserInfoMapper {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(String tel,String pwd) {
        jdbcTemplate.update("INSERT INTO blog.tp_user(tel,password,nickname,secret) VALUES (?,?,?,uuid())",tel,pwd,tel);
    }
}
