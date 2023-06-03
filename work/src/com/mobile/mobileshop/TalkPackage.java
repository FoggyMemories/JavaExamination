package com.mobile.mobileshop;

public class TalkPackage extends ServicePackage {

    public TalkPackage() {
        super.setTalkTime(500);
        super.setFlow(0);
        super.setSmsCount(30);
        super.setPrice(58);
    }

    public TalkPackage(int talkTime, int flow, int smsCount, double price, double allPay, Object pack) {
        super(talkTime, flow, smsCount, price, allPay, pack);
    }

}
