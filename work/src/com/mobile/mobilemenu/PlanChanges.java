package com.mobile.mobilemenu;

import com.mobile.data.CustomerInfo;
import com.mobile.util.ReturnUtil;

//套餐变更
public class PlanChanges {
    public PlanChanges(CustomerInfo ci) {

        System.out.println("套餐变更");

        //提示用户返回上一级
        new ReturnUtil(ci);
    }
}
