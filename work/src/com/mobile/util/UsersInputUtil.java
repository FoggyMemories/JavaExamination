package com.mobile.util;

import com.mobile.errors.NoneFoundNumberException;


//用户JavaBean
public class UsersInputUtil {
    private int WelcomeNum;
    private int WEIMenuNum;
    private int chooseCardNum;
    private int chooseTypeNum;

    public UsersInputUtil() {
    }

    public UsersInputUtil(int WelcomeNum, int WEIMenuNum) {
        this.WelcomeNum = WelcomeNum;
        this.WEIMenuNum = WEIMenuNum;
    }

    public UsersInputUtil(int WelcomeNum, int WEIMenuNum, int ChooseCardNum) {
        this.WelcomeNum = WelcomeNum;
        this.WEIMenuNum = WEIMenuNum;
        this.chooseCardNum = ChooseCardNum;
    }

    public UsersInputUtil(int WelcomeNum, int WEIMenuNum, int chooseCardNum, int chooseTypeNum) {
        this.WelcomeNum = WelcomeNum;
        this.WEIMenuNum = WEIMenuNum;
        this.chooseCardNum = chooseCardNum;
        this.chooseTypeNum = chooseTypeNum;
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
            throw new NoneFoundNumberException();
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

    /**
     * 获取
     * @return ChooseCardNum
     */
    public int getChooseCardNum() {
        return chooseCardNum;
    }

    /**
     * 设置
     * @param ChooseCardNum
     */
    public void setChooseCardNum(int ChooseCardNum) {
        if(ChooseCardNum < 0 || ChooseCardNum > 9){
            throw new NoneFoundNumberException();
        }
        this.chooseCardNum = ChooseCardNum;
    }

    /**
     * 获取
     * @return chooseTypeNum
     */
    public int getChooseTypeNum() {
        return chooseTypeNum;
    }

    /**
     * 设置
     * @param chooseTypeNum
     */
    public void setChooseTypeNum(int chooseTypeNum) {
        if(chooseTypeNum < 0 || chooseTypeNum > 3){
            throw new NoneFoundNumberException();
        }
        this.chooseTypeNum = chooseTypeNum;
    }
}
