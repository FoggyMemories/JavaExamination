package com.mobile.service;

import com.mobile.errors.NoneFoundNumberException;

public class Users {
    private int num;

    public Users() {
    }

    public Users(int num) {
        this.num = num;
    }

    /**
     * 获取
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(int num) {
        if(num < 1 || num > 6){
            throw new NoneFoundNumberException("请输入 1 ~ 6 之间的整数");
        }
        this.num = num;
    }

    public String toString() {
        return "UsersInput{num = " + num + "}";
    }
}
