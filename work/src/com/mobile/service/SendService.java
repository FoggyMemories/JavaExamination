package com.mobile.service;

import com.mobile.data.CustomerInfo;

//发短信操作

public interface SendService {
    void sendMessage(int count, CustomerInfo ci);
}
