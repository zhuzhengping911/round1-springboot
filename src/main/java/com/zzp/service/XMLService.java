package com.zzp.service;

import com.zzp.dao.impl.MybatisUserAnnotaionMapper;
import com.zzp.dao.impl.MybatisUserXMLMapper;
import com.zzp.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by zhuzhengping on 2017/5/13.
 */
@Service
public class XMLService {

    @Autowired
    private MybatisUserXMLMapper mapper;


    public void updateUser(String user_id, String nickName) {
        mapper.updateUser(user_id,nickName);
    }

    public UserInfo getUser(Integer id) {
        return mapper.getUser(id);
    }

    public void deleteUserByUserId(UserInfo userInfo) {
        mapper.deleteUserByUserId(userInfo);
    }

    public void createUser(Map<String, Object> reqMap) {
        mapper.createUser(reqMap);
    }
}
