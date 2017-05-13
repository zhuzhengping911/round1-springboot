package com.zzp.dao.impl;

import com.zzp.pojo.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.Map;

/**
 * Created by zhuzhengping on 2017/5/13.
 */
@Mapper
public interface MybatisUserAnnotaionMapper {

    @Insert("INSERT INTO blog.tp_user(tel,password,nickname,secret) VALUES (#{tel},md5(#{pwd}),#{tel},'')")
    void createUser(Map<String, Object> reqMap);

    @Select("select tel,nickname,password FROM blog.tp_user WHERE user_id = #{id}")
    UserInfo getUser(@Param("id") Integer id);

    @Update("UPDATE blog.tp_user SET nickname = #{nickName} WHERE user_id = #{userId}")
    void updateUser(@Param("userId") String user_id, @Param("nickName") String nickName);

    @Delete("DELETE FROM blog.tp_user WHERE tel = #{tel}")
    void deleteUserByUserId(UserInfo userInfo);
}
