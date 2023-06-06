package com.mobile.service;

import com.mobile.data.CustomerInfo;
import com.mobile.mobileshop.AllServicePackage;
import com.mobile.topmenu.BillingDescription;

//用户使用

public class Consume implements CallService, NetService, SendService {

    BillingDescription b = new BillingDescription(0.2, 0.1, 0.1);

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
            double remainCustomerAmount = ci.getCustomerAmount() - (b.getTalkPrice() * minCount);
            ci.setCustomerAmount(remainCustomerAmount);
        }
    }

    @Override
    public void netPlay(int flow, CustomerInfo ci) {
        AllServicePackage serPackage = ci.getSerPackage();

        //获取套餐内的流量剩余 - 本次流量使用
        int remaining = serPackage.getFlow() - flow;
        //判断是否超过套餐标称
        if (remaining >= 0) {
            //没有超过套餐标称
            ci.setRemainFlow(remaining);
        } else {
            //超过了套餐标称
            ci.setRemainFlow(0);
            //从用户账户中扣款
            double remainCustomerAmount = ci.getCustomerAmount() - (b.getFlowPrice() * flow);
            ci.setCustomerAmount(remainCustomerAmount);
        }
    }

    @Override
    public void sendMessage(int count, CustomerInfo ci) {
        AllServicePackage serPackage = ci.getSerPackage();

        //获取套餐内的短信条数 - 本次发送条数
        int remaining = serPackage.getSmsCount() - count;
        //判断是否超过套餐标称
        if (remaining >= 0) {
            //没有超过套餐标称
            ci.setRemainSMSCount(remaining);
        } else {
            //超过了套餐标称
            ci.setRemainSMSCount(0);
            //从用户账户中扣款
            double remainCustomerAmount = ci.getCustomerAmount() - (b.getSMSPrice() * count);
            ci.setCustomerAmount(remainCustomerAmount);
        }
    }
}
