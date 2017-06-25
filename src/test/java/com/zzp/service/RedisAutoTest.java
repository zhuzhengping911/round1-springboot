package com.zzp.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhuzhengping on 2017/6/25.
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisAutoTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void save(){

        stringRedisTemplate.opsForValue().set("zzp","big z");
        Assert.assertEquals("big z",stringRedisTemplate.opsForValue().get("zzp"));
    }
}
