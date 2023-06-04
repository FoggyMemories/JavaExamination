package com.mobile.mobilemenu;


import com.mobile.data.CustomerInfo;
import com.mobile.util.ReturnUtil;

//本月账单查询
public class BillingQuery {
    public BillingQuery(CustomerInfo ci) {

        System.out.println("您的卡号是:" + ci.getCardNumber());
        System.out.println("------当月账单------");
        System.out.println("套餐资费:" + ci.getSerPackage().getPrice());
        System.out.println("合计:" + (ci.getSerPackage().getPrice() + ci.getAllPay()));
        System.out.println("账户余额:" + ci.getCustomerAmount());
        System.out.println("------------------------------------------------------------------------");

        //提示用户返回上一级
        new ReturnUtil(ci);

    }
}
