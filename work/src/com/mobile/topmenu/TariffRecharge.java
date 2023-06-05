package com.mobile.topmenu;


import com.mobile.data.CustomerInfo;
import com.mobile.util.CardUtil;

import java.util.HashMap;
import java.util.Scanner;

import static com.mobile.util.JudgeUtil.judgePhoneNumber;

//话费充值

public class TariffRecharge {
    public TariffRecharge() {
        //导入用户库看看是否存在此用户
        CardUtil cu = new CardUtil();
        HashMap<String, CustomerInfo> hm = cu.getHashMap();
        Scanner sc = new Scanner(System.in);


        while (true) {
            String strPhoneNumber = null;
            String strChargeNum = null;
            loop:
            try {
                System.out.println("请输入充值卡号(如需退出登陆,请输入:exit)");
                System.out.print(":");
                strPhoneNumber = sc.nextLine();
                if (strPhoneNumber.equalsIgnoreCase("exit")) {
                    new WelcomeScreen();
                    break;
                }
                //用于判断电话号码是否合法
                Long.parseLong(strPhoneNumber);
                if (!judgePhoneNumber(strPhoneNumber)) {
                    System.out.println("手机号不合法");
                    break loop;
                }

                System.out.print("请输入充值金额:");
                strChargeNum = sc.nextLine();
                int chargeNum = Integer.parseInt(strChargeNum);

                if (chargeNum < 50) {
                    System.out.println("对不起,最低充值金额为50元");
                    break;
                }

                double remainCustomerAmount = hm.get(strPhoneNumber).getCustomerAmount() + chargeNum;
                hm.get(strPhoneNumber).setCustomerAmount(remainCustomerAmount);

                //打印充值成功后的界面
                System.out.println("******充值成功******");
                System.out.println("卡号:" + hm.get(strPhoneNumber).getCardNumber());
                System.out.println("用户名:" + hm.get(strPhoneNumber).getUserName());
                System.out.println("充值的金额:" + strChargeNum);
                System.out.println("充值后的余额:" + hm.get(strPhoneNumber).getCustomerAmount());
                new WelcomeScreen();
                break;
            } catch (NumberFormatException e) {
                System.out.println("*输入的格式不合法,请重新输入.*");
            } catch (NullPointerException e) {
                System.out.println("******充值成功******");
                System.out.println("卡号:" + strPhoneNumber + ",已充值金额:" + strChargeNum);
                break;
            }
        }
        //释放资源
        sc.close();
    }
}
