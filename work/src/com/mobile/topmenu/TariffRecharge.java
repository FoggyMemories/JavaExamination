package com.mobile.topmenu;


import java.util.Scanner;

import static com.mobile.util.judgeUtil.judgePhoneNumber;

//话费充值
public class TariffRecharge {
    public TariffRecharge() {
        System.out.println("话费充值");
        Scanner sc = new Scanner(System.in);


        while (true) {
            try {
                System.out.print("请输入充值卡号:");
                String strPhoneNumber = sc.nextLine();
                //用于判断电话号码是否合法
                Long.parseLong(strPhoneNumber);
                if (!judgePhoneNumber(strPhoneNumber)) {
                    System.out.println("手机号不合法");
                    break;
                }

                System.out.print("请输入充值金额:");
                String strChargeNum = sc.nextLine();
                int chargeNum = Integer.parseInt(strChargeNum);

                if (chargeNum < 50) {
                    System.out.println("对不起,最低充值金额为50元");
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        //释放资源
        sc.close();
    }
}
