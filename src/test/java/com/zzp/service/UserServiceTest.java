package com.zzp.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhuzhengping on 2017/4/22.
 * 测试类
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void createUser() throws Exception {
        userService.createUser("13311111111","000000");
        userService.createUser("13322222222","111111");
        userService.createUser("13333333333","222222");
        userService.createUser("13344444444","333333");
        userService.createUser("13355555555","444444");
        userService.createUser("13366666666","555555");

    }

    @Test
    public void getUser() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

}