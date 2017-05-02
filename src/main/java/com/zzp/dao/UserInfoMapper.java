package com.zzp.dao;

import com.zzp.pojo.UserInfo;

/**
 * Created by zhuzhengping on 2017/4/22.
 * Mapper接口
 */
public interface UserInfoMapper {

    void createUser(String tel,String pwd);

    UserInfo getUser(Integer id);

    void updateUser(String user_id, String nickName);

    void deleteUserByUserId(Integer id);
}
