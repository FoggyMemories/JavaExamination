package com.mobile.service;

import com.mobile.data.CustomerInfo;

//打电话操作

public interface CallService {
    void call(int minCount, CustomerInfo ci);
}
