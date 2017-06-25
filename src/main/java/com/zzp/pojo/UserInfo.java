package com.zzp.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * Created by zhuzhengping on 2017/4/22.
 * 实体类，可用于Controller中直接接受参数
 */
public class UserInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private String tel;

    private String nickName;

    @Max(value = 999999,message = "超过最大数值")
    @Min(value = 000000,message = "密码设定不正确")
    private String passWord;

    public UserInfo() {
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "tel='" + tel + '\'' +
                ", nickName='" + nickName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public UserInfo(String tel, String nickName, String passWord) {
        this.tel = tel;
        this.nickName = nickName;
        this.passWord = passWord;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
