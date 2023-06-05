package com.mobile.mobilemenu;

import com.mobile.data.CustomerInfo;
import com.mobile.util.ReturnUtil;

//办理退网

public class CancelNetwork {
    public CancelNetwork(CustomerInfo ci) {

        System.out.println("办理退网");

        //提示用户返回上一级
        new ReturnUtil(ci);
    }
}
