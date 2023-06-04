package com.mobile.mobileshop;

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

    public SuperPackage(int talkTime, int flow, int smsCount, double price, Object pack) {
        super(talkTime, flow, smsCount, price, pack);
    }


    /**
     * @param minCount 用户通话时长余额
     * @param card 用户卡号
     * @return 本次通话时长
     */
    @Override
    public int call(int minCount, customerInfo card) {
        int temp = minCount;

        return 0;
    }

    @Override
    public int netPlay(int flow, customerInfo card) {
        return 0;
    }

    @Override
    public int sendMessage(int count, customerInfo card) {
        return 0;
    }
}
