package com.mobile.entity;

//超人套餐

import com.mobile.service.Consume;

public class SuperPackage extends AllServicePackage implements Consume {

    public SuperPackage() {
        super.setTalkTime(200);
        super.setFlow(10 * 1024);
        super.setSmsCount(50);
        super.setPrice(78);
    }

    public SuperPackage(int talkTime, int flow, int smsCount, double price) {
        super(talkTime, flow, smsCount, price);
    }

    @Override
    public void showInfo() {
        System.out.println("超人套餐:通话时长:" + getTalkTime() + "分钟/月,上网流量:" + (getFlow() / 1024) +
                "Gb/月,短信条数:" + getSmsCount() + "条/月,资费标准:" + price);
    }

}
