package com.mobile.service;

import com.mobile.data.CustomerInfo;
import com.mobile.mobileshop.AllServicePackage;

public class Consume implements CallService,NetService,SendService{
    @Override
    public int call(int minCount, CustomerInfo ci) {
        AllServicePackage serPackage = ci.getSerPackage();
        int remaining = serPackage.getTalkTime() - minCount;
        return 0;
    }

    @Override
    public int netPlay(int flow, CustomerInfo ci) {
        return 0;
    }

    @Override
    public int sendMessage(int count, CustomerInfo ci) {
        return 0;
    }
}
