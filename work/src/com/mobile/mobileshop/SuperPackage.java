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
        super.setAllPay(0);
    }

    public SuperPackage(int talkTime, int flow, int smsCount, double price, double allPay, Object pack) {
        super(talkTime, flow, smsCount, price, allPay, pack);
    }

    /**
     * @param minCount 用户通话时长余额
     * @param card     用户卡号
     * @return 本次通话时长
     */
    @Override
    public int call(int minCount, MobileCard card) {
        int temp = minCount;

        return 0;
    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        return 0;
    }

    @Override
    public int sendMessage(int count, MobileCard card) {
        return 0;
    }
}
