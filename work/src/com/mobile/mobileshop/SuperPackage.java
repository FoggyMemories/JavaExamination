package com.mobile.mobileshop;

import com.mobile.service.CallService;
import com.mobile.service.NetService;
import com.mobile.service.SendService;

public class SuperPackage extends ServicePackage implements CallService, SendService, NetService {


    public SuperPackage() {
        super.setTalkTime(200);
        super.setFlow(10 * 1024);
        super.setSmsCount(50);
        super.setPrice(78);
    }

    public SuperPackage(int talkTime, int flow, int smsCount, double price, Object pack) {
        super(talkTime, flow, smsCount, price, pack);
    }

    @Override
    public int sendMessage(int count, MobileCard card) {
        return 1;
    }

    @Override
    public int call(int minCount, MobileCard card) {
        return 0;
    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        return 0;
    }
}
