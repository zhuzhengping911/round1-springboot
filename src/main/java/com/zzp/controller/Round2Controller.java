package com.zzp.controller;

import com.zzp.pojo.ZZPProperties;
import com.zzp.pojo.Zzp2Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhengping on 2017/4/9.
 * 读取配置文件
 * 使用@Value直接读取
 * 当属性是静态属性时，@Value用于set方法上
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

    @Value("${zzp2.name}")
    private String name2;

    @Value("${zzp2.girl.age}")
    private Integer girlAge;

    @Value("${zzp2.girl.name}")
    private String girlName;

    private static String name3;

    private static Integer age3;

    private static String height3;

    @Value("${zzp3.name}")
    public void setName3(String name3) {
        Round2Controller.name3 = name3;
    }

    @Value("${zzp3.age}")
    public void setAge3(Integer age3) {
        Round2Controller.age3 = age3;
    }

    @Value("${zzp3.height}")
    public void setHeight3(String height3) {
        Round2Controller.height3 = height3;
    }

    @Autowired
    private ZZPProperties zzpProperties;

    @Autowired
    private Zzp2Properties zzp2Properties;

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


    @RequestMapping(value = "/getZzpGirlInfo",method = RequestMethod.GET)
    public String getZzpGirlInfo(){
        return "zzp2.name:" + name2 + "\n" + "zzp2.girl.age:" + girlAge + "\n" + "zzp2.girl.name:" + girlName;
    }

    @RequestMapping(value = "/getZzpGirlInfo2",method = RequestMethod.GET)
    public Zzp2Properties getZzpGirlInfo2(){
        return zzp2Properties;
    }

    @RequestMapping(value = "/getZzp3Info",method = RequestMethod.GET)
    public String getZzp3Info(){
        return "zzp3.name:" + name3 + "\n" + "zzp3.age:" + age3 + "\n" + "zzp3.height:" + height3;
    }
}
