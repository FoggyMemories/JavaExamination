package com.mobile.mobilemenu;


import com.mobile.data.CustomerInfo;
import com.mobile.topmenu.WelcomeScreen;

import java.util.Scanner;

//WEI移动用户菜单

public class WEIMenu {
    private static final int BILLING_QUERY = 1;
    private static final int MARGIN_QUERY = 2;
    private static final int PRINT_LIST = 3;
    private static final int PLAN_CHANGES = 4;
    private static final int CANCEL_NETWORK = 5;

    static {
        System.out.println("****************************WEI移动用户菜单****************************");
    }

    public WEIMenu(CustomerInfo ci) {
        System.out.println("------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            print();
            try {
                System.out.println("请选择,其他键返回上一级");
                System.out.print(":");
                //将输入的字符串格式的数字转化为int类型的字符串
                String strNum = sc.nextLine();
                int num = Integer.parseInt(strNum);

                switch (num) {
                    case BILLING_QUERY -> new BillingQuery(ci);
                    case MARGIN_QUERY -> new MarginQuery(ci);
                    case PRINT_LIST -> new PrintList(ci);
                    case PLAN_CHANGES -> new PlanChanges(ci);
                    case CANCEL_NETWORK -> new CancelNetwork(ci);
                    default -> {
                        new WelcomeScreen();
                        break loop;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                new WelcomeScreen();
                break;
            }
        }

        //释放资源
        sc.close();
    }

    //题头打印
    public static void print() {
        System.out.println("1.本月账单查询");
        System.out.println("2.套餐余量查询");
        System.out.println("3.打印消费详单");
        System.out.println("4.套餐变更");
        System.out.println("5.办理退网");
    }

}
