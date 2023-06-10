package com.mobile.topmenu;

import com.mobile.entity.NetPackage;
import com.mobile.entity.SuperPackage;
import com.mobile.entity.TalkPackage;

//资费说明

public class TariffDescription {
    public TariffDescription() {
        BillingDescription b = new BillingDescription(0.2, 0.1, 0.1);

        System.out.println("套餐类型:" + "超人套餐\n" + new SuperPackage());
        System.out.println("--------------------");
        System.out.println("套餐类型:" + "网虫套餐\n" + new NetPackage());
        System.out.println("--------------------");
        System.out.println("套餐类型:" + "话痨套餐\n" + new TalkPackage());
        System.out.println("--------------------");

        System.out.println("超出套餐计费:");
        System.out.println("通话时长:" + b.getTalkPrice() + "元/分钟");
        System.out.println("上网流量:" + b.getFlowPrice() + "元/Mb");
        System.out.println("短信发送:" + b.getSMSPrice() + "元/条");
        System.out.println("--------------------");

        new WelcomeScreen();
    }
}
