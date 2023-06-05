package com.mobile.topmenu;

import com.mobile.data.CustomerInfo;
import com.mobile.util.CardUtil;

import java.util.HashMap;
import java.util.Scanner;

import static com.mobile.util.JudgeUtil.judgePhoneNumber;

//使用WEI

public class UseWEI {
    public UseWEI() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            CustomerInfo c = new CustomerInfo();
            System.out.print("请输入卡号:");
            try {
                String cardNumber = sc.nextLine();
                c.setCardNumber(cardNumber);
                Long.parseLong(c.getCardNumber());

                //对比正则,查看输入的卡号是否合法
                boolean b = judgePhoneNumber(c.getCardNumber());

                //引入总库,对比卡号是否存在
                CardUtil cardUtil = new CardUtil();
                HashMap<String, CustomerInfo> cards = cardUtil.getHashMap();

                //判断输入的卡号在库中是否存在
                boolean b1 = cards.containsKey(cardNumber);

                if (!b || !b1) {
                    System.out.println("*该卡号信息不存在(输入任意字符继续,如需退出,请输入:exit)*");
                    System.out.print(":");
                    String str = sc.nextLine();
                    if (str.equalsIgnoreCase("exit")) {
                        new WelcomeScreen();
                        break;
                    }
                } else {
                    System.out.print("卡号正确,");
                }
            } catch (NumberFormatException e) {
                System.out.println("*输入的为非数字,请重新输入*");
            }
        }

        System.out.println("通知朋友手机换号,发送短信50条");
        System.out.println("不存在此卡的消费记录,已添加一条消费记录");

        new WelcomeScreen();
    }
}