package com.zzp.service;

import com.zzp.pojo.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhuzhengping on 2017/6/25.
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisAutoTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate<String,UserInfo> Template;

    @Test
    public void save(){

        stringRedisTemplate.opsForValue().set("zzp","big z");
        Assert.assertEquals("big z",stringRedisTemplate.opsForValue().get("zzp"));
    }

    @Test
    public void testobj() throws InterruptedException {
        UserInfo user = new UserInfo("15201803745","snow","112358");
        ValueOperations<String,UserInfo> operations = redisTemplate.opsForValue();
        operations.set("User:zzp",user);
        Thread.sleep(1000);
        operations.set("User:zzq",user);
        Thread.sleep(1000);
        Assert.assertEquals(true,redisTemplate.hasKey("User:zzp"));
        Assert.assertEquals(true,redisTemplate.hasKey("User:zzq"));
    }

    @Test
    public void testobjSerializer() throws InterruptedException {
        UserInfo user = new UserInfo("111111","snow","112358");
        Template.opsForValue().set("User:snow",user);
        Assert.assertEquals(true,redisTemplate.hasKey("User:snow"));
    }

    @Test
    public void useJedis() throws InterruptedException {

    }
}
