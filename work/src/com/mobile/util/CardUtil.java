package com.mobile.util;

import com.mobile.data.CustomerInfo;
import com.mobile.mobileshop.NetPackage;
import com.mobile.mobileshop.SuperPackage;
import com.mobile.mobileshop.TalkPackage;

import java.util.HashMap;

public class CardUtil {
    public HashMap<String, CustomerInfo> getHashMap() {
        HashMap<String, CustomerInfo> cards = new HashMap<>();

        CustomerInfo card1 = new CustomerInfo("熊大", "123", "13998765412", new TalkPackage());
        CustomerInfo card2 = new CustomerInfo("熊二", "234", "13962345678", new NetPackage());
        CustomerInfo card3 = new CustomerInfo("光头强", "456", "13926485946", new SuperPackage());
        CustomerInfo card4 = new CustomerInfo("涂涂", "789", "13968534598", new TalkPackage());

        card4.setCustomerAmount(98);
        card4.setRealTalkTime(500);
        card4.setRealSMSCount(100);


        cards.put(card1.getCardNumber(), card1);
        cards.put(card2.getCardNumber(), card2);
        cards.put(card3.getCardNumber(), card3);
        cards.put(card4.getCardNumber(), card4);

        return cards;
    }
}
