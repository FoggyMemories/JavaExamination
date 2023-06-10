package com.mobile.service;

import com.mobile.data.CustomerInfo;

//通话服务接口

public interface CallService {
    void call(int minCount, CustomerInfo ci);
}
