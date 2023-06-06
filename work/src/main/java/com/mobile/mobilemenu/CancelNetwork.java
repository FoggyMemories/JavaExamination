package com.mobile.mobilemenu;

import com.mobile.data.CustomerInfo;
import com.mobile.util.ReturnUtil;

//办理退网

public class CancelNetwork {
    public CancelNetwork(CustomerInfo ci) {

        System.out.println("------办理退网------");
        System.out.println("卡号:" + ci.getCardNumber() + "办理退网成功!");
        System.out.println("谢谢使用!");

        //提示用户返回上一级
        new ReturnUtil(ci);
    }
}
