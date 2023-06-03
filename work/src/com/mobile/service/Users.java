package com.mobile.service;

import com.mobile.errors.NoneFoundNumberException;


//用户JavaBean
public class Users {
    private int WelcomeNum;
    private int WEIMenuNum;

    public Users() {
    }

    public Users(int WelcomeNum, int WEIMenuNum) {
        this.WelcomeNum = WelcomeNum;
        this.WEIMenuNum = WEIMenuNum;
    }

    /**
     * 获取
     *
     * @return num
     */
    public int getWelcomeNum() {
        return WelcomeNum;
    }

    /**
     * 设置
     *
     * @param welcomeNum
     */
    public void setWelcomeNum(int welcomeNum) {
        if (welcomeNum < 1 || welcomeNum > 6) {
            throw new NoneFoundNumberException("请输入 1 ~ 6 之间的整数");
        }
        this.WelcomeNum = welcomeNum;
    }

    /**
     * 获取
     *
     * @return WEIMenuNum
     */
    public int getWEIMenuNum() {
        return WEIMenuNum;
    }

    /**
     * 设置
     *
     * @param WEIMenuNum
     */
    public void setWEIMenuNum(int WEIMenuNum) {
        this.WEIMenuNum = WEIMenuNum;
    }

    @Override
    public String toString() {
        return "Users{" +
                "WelcomeNum=" + WelcomeNum +
                ", WEIMenuNum=" + WEIMenuNum +
                '}';
    }
}
