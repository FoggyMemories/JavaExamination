package com.mobile.mobileshop;

import com.mobile.data.CustomerInfo;
import com.mobile.service.CallService;
import com.mobile.service.NetService;
import com.mobile.service.SendService;

public class SuperPackage extends AllServicePackage implements CallService, SendService, NetService {


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
    public int call(int minCount, CustomerInfo card) {
        return 0;
    }

    @Override
    public int netPlay(int flow, CustomerInfo card) {
        return 0;
    }

    @Override
    public int sendMessage(int count, CustomerInfo card) {
        return 0;
    }
}
