package com.zzp.dao.impl;

import com.zzp.pojo.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by zhuzhengping on 2017/5/13.
 */
@Mapper
@Repository
public interface MybatisUserXMLMapper {

    void createUser(Map<String, Object> reqMap);

    UserInfo getUser(@Param("id") Integer id);

    void updateUser(@Param("userId") String user_id, @Param("nickName") String nickName);

    void deleteUserByUserId(UserInfo userInfo);
}
