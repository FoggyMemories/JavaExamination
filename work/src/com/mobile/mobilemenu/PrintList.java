package com.mobile.mobilemenu;


import com.mobile.data.CustomerInfo;
import com.mobile.util.ReturnUtil;

//打印消费详单
public class PrintList {
    public PrintList(CustomerInfo ci) {

        System.out.println("打印消费详单");

        //提示用户返回上一级
        new ReturnUtil(ci);
    }
}
