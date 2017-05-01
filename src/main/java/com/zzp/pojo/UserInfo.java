package com.zzp.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by zhuzhengping on 2017/4/22.
 */
public class UserInfo {

    private String tel;

    private String nickName;

    @Max(value = 999999,message = "超过最大数值")
    @Min(value = 000000,message = "密码设定不正确")
    private String passWord;

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
