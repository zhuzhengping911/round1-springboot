package com.zzp.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhuzhengping on 2017/4/16.
 * 直接获取配置文件的实体类
 */
@Component
@ConfigurationProperties(value = "zzp2")
public class Zzp2Properties {

    private String name;

    private String height;

    private String weight;

    private Integer age;

    private Girl girl;

    @Override
    public String toString() {
        return "Zzp2Properties{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", age=" + age +
                ", girl=" + girl +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }
}
