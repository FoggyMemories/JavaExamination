package com.mobile.service;

import com.mobile.data.CustomerInfo;
import com.mobile.mobileshop.AllServicePackage;

public class Consume implements CallService, NetService, SendService {
    @Override
    public void call(int minCount, CustomerInfo ci) {
        AllServicePackage serPackage = ci.getSerPackage();

        //获取套餐内的通话时常 - 本次通话时长
        int remaining = serPackage.getTalkTime() - minCount;
        //判断是否超过套餐标称
        if (remaining >= 0) {
            //没有超过套餐标称
            ci.setRemainTalkTime(remaining);
        } else {
            //超过了套餐标称
            ci.setRemainTalkTime(0);
            //从用户账户中扣款
            double remainCustomerAmount = ci.getCustomerAmount() - 0.2 * minCount;
            ci.setCustomerAmount(remainCustomerAmount);
        }
    }

    @Override
    public void netPlay(int flow, CustomerInfo ci) {

    }

    @Override
    public void sendMessage(int count, CustomerInfo ci) {

    }
}
