package com.mobile.entity;

//话痨套餐

import com.mobile.service.Consume;

public class TalkPackage extends AllServicePackage implements Consume {

    public TalkPackage() {
        super.setTalkTime(500);
        super.setFlow(0);
        super.setSmsCount(30);
        super.setPrice(58);
    }

    public TalkPackage(int talkTime, int flow, int smsCount, double price) {
        super(talkTime, flow, smsCount, price);
    }

    @Override
    public void showInfo() {
        System.out.println("话痨套餐:通话时长:" + getTalkTime() + "分钟/月,上网流量:" + (getFlow() / 1024) +
                "Gb/月,短信条数:" + getSmsCount() + "条/月,资费标准:" + price);
    }

}
