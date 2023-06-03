package com.mobile.util;

import com.mobile.mobileshop.MobileCard;
import com.mobile.mobileshop.NetPackage;
import com.mobile.mobileshop.SuperPackage;
import com.mobile.mobileshop.TalkPackage;

import java.util.HashMap;

public class CardUtil {
    public HashMap<String, MobileCard> getHashMap() {
        HashMap<String, MobileCard> cards = new HashMap<>();

        MobileCard card1 = new MobileCard("熊大", "123", "13998765412", new TalkPackage(), 0, 0, 0, 0);
        MobileCard card2 = new MobileCard("熊二", "234", "13962345678", new NetPackage(), 0, 0, 0, 0);
        MobileCard card3 = new MobileCard("光头强", "456", "13926485946", new SuperPackage(), 0, 0, 0, 0);
        MobileCard card4 = new MobileCard("涂涂", "789", "13968534598", new TalkPackage(), 0, 0, 0, 0);

        card4.setCustomerAmount(98);
        card4.setRealTalkTime(500);
        card4.setRealSMSCount(100);



        cards.put("13956482685", card1);
        cards.put("13956486685", card2);
        cards.put("13956472685", card3);
        cards.put("13956482585", card4);

        return cards;
    }
}
