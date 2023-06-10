package com.mobile.entity;

//网虫套餐

import com.mobile.service.Consume;

public class NetPackage extends AllServicePackage implements Consume {

    public NetPackage() {
        super.setTalkTime(0);
        super.setFlow(30 * 1024);
        super.setSmsCount(0);
        super.setPrice(68);
    }

    public NetPackage(int talkTime, int flow, int smsCount, double price) {
        super(talkTime, flow, smsCount, price);
    }

    @Override
    public void showInfo() {
        System.out.println("网虫套餐:通话时长:" + getTalkTime() + "分钟/月,上网流量:" + (getFlow() / 1024) +
                "Gb/月,短信条数:" + getSmsCount() + "条/月,资费标准:" + price);
    }
}
