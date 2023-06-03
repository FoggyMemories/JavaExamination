package com.mobile.mobileshop;

public class NetPackage extends ServicePackage {


    public NetPackage() {
        super.setTalkTime(0);
        super.setFlow(30 * 1024);
        super.setSmsCount(0);
        super.setPrice(68);
    }

    public NetPackage(int talkTime, int flow, int smsCount, double price, Object pack) {
        super(talkTime, flow, smsCount, price, pack);
    }
}
