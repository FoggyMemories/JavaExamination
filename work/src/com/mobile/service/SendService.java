package com.mobile.service;

import com.mobile.data.CustomerInfo;

public interface SendService {
    void sendMessage(int count, CustomerInfo ci);
}
