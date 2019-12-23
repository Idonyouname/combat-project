package com.liugui.servicebase.utils;

import java.io.Serializable;

/**
 * @ClassName: Msg
 * @Author: liugui
 * @Date: 2019-12-23 11:25
 **/
public class Msg<T> implements Serializable {
    //执行状态 1表示成功 2表示失败
    private String state;

    //返回的提示语
    private String code;

    //返回的数据
    private T data;

    public Msg<T> msg(String state,String code,T data){
        this.state = state;
        this.code = code;
        this.data = data;
        return  this;
    }

    public Msg<T> success(String code){
        this.state ="1";
        this.code = code;
        return  this;
    }

    public Msg<T> openSuccess(){
        this.state ="1";
        this.code = "操作成功";
        return  this;
    }

    public Msg<T> openFail(){
        this.state ="2";
        this.code = "操作失败";
        return  this;
    }

    public Msg<T> dataSuccess(T data){
        this.state ="1";
        this.code = "查询成功";
        this.data = data;
        return  this;
    }

    public Msg<T> fail(String code){
        this.state ="2";
        this.code = code;
        return  this;
    }

    public Msg<T> success(){
        this.state ="1";
        return  this;
    }

    public Msg<T> fail(){
        this.state ="2";
        return  this;
    }

    public Msg<T> setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return state;
    }

    public String getCode() {
        return code;
    }

    public Msg<T> setCode(String code) {
        this.code = code;
        return  this;
    }

    public T getData() {
        return data;
    }

    public Msg<T> setData(T data) {
        this.data = data;
        return  this;
    }

    /**
     *  这个判断返回的结果是不是为1(success)这里使用静态，返回结果不会出现success字段，如果不用static标注，序列化之后会有success字段
     * @param msg
     * @return
     */
    public static boolean isSuccess(Msg msg){
        if (msg == null){
            return false;
        }
        return "1".equals(msg.state.trim());
    }

    @Override
    public String toString() {
        return "Msg{" +
                "state='" + state + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}

