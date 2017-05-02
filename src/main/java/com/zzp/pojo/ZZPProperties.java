package com.zzp.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhuzhengping on 2017/4/9.
 * 直接获取配置文件中的属性，prefix为属性前缀
 */
@Component
@ConfigurationProperties(prefix = "zzp")
public class ZZPProperties {

    private String name;

    private String height;

    private String weight;

    private Integer age;

    @Override
    public String toString() {
        return "ZZPProperties{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", age=" + age +
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
}
