package com.mobile.mobilemenu;


import com.mobile.data.CustomerInfo;
import com.mobile.util.ReturnUtil;

//套餐余量查询
public class MarginQuery {
    public MarginQuery(CustomerInfo ci) {
        System.out.println("您的卡号是:" + ci.getCardNumber());
        System.out.println("------套餐内剩余------");
        System.out.println("通话时长:" + ci.getRealTalkTime() + "分钟");
        System.out.println("短信条数:" + ci.getRemainSMSCount() + "条");
        System.out.println("剩余流量:" + (ci.getRemainFlow() / 1024) + "GB");

        //提示用户返回上一级
        new ReturnUtil(ci);
    }
}
