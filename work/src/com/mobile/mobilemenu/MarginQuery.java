package com.mobile.mobilemenu;


import com.mobile.mobileshop.MobileCard;

//套餐余量查询
public class MarginQuery {
    public MarginQuery(MobileCard mc) {
        System.out.println("您的卡号是:" + mc.getCardNumber());
        System.out.println("---套餐内剩余---");
        System.out.println("通话时长:" + mc.getRealTalkTime());
        System.out.println("短信条数:" + mc.getRealSMSCount());
    }
}
