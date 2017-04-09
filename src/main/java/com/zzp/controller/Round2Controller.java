package com.zzp.controller;

import com.zzp.pojo.ZZPProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/4/9.
 */
@RequestMapping("/round2")
@RestController
public class Round2Controller {

    @Value("${zzp.name}")
    private String name;

    @Value("${zzp.age}")
    private Integer age;

    @Value("${zzp.height}")
    private String height;

    @Autowired
    private ZZPProperties zzpProperties;

    @RequestMapping(method = RequestMethod.GET)
    public String round2(){
        return "ROUND 2";
    }

    @RequestMapping(value = "/zzp",method = RequestMethod.GET)
    public String getZZPInfo(){
        return "zzp.name:" + name + " zzp.age:" + age + " zzp.height:" + height;
    }

    @RequestMapping(value = "/getZzpInfo",method = RequestMethod.GET)
    public ZZPProperties getZzpInfo(){
        return zzpProperties;
    }
}
