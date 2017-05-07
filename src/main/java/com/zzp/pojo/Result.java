package com.zzp.pojo;

/**
 * Created by zhengping.zhu
 * on 2017/3/22.
 */
public class Result<T> {

    //    error_code 状态值：0 极为成功，其他数值代表失败
    private Integer status;

    //    error_msg 错误信息，若status为0时，为success
    private String msg;

    //    content 返回体报文的出参，使用泛型兼容不同的类型
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer code) {
        this.status = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData(Object object) {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
