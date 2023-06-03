package com.mobile.mobilemenu;


import com.mobile.mobileshop.MobileCard;


//本月账单查询
public class BillingQuery {
    public BillingQuery(MobileCard mc) {

        System.out.println("您的卡号是:" + mc.getCardNumber());
        System.out.println("---当月账单---");
        System.out.println("套餐资费:" + mc.getSerPackage().getPrice());
        System.out.println("合计:" + mc.getRealTalkTime());
        System.out.println("通话时长:" + mc.getRealTalkTime());
    }
}
