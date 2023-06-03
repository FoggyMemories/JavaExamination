package com.mobile.mobilemenu;


import com.mobile.mobileshop.MobileCard;
import com.mobile.topmenu.UsersInput;

import java.util.Scanner;

public class UesWEI {
    private static final int BILLING_QUERY = 1;
    private static final int MARGIN_QUERY = 2;
    private static final int PRINT_LIST = 3;
    private static final int PLAN_CHANGES = 4;
    private static final int CANCEL_NETWORK = 5;

    static {
        System.out.println("*****WEI移动用户菜单*****");
    }

    public UesWEI(MobileCard mc) {
        Scanner sc = new Scanner(System.in);
        UsersInput u = new UsersInput();

        loop:
        while (true) {
            print();
            try {
                System.out.println("请选择,其他键返回上一级");
                //将输入的字符串格式的数字转化为int类型的字符串
                String strNum = sc.nextLine();
                int num = Integer.parseInt(strNum);
                u.setWEIMenuNum(num);

                switch (u.getWEIMenuNum()) {
                    case BILLING_QUERY -> new BillingQuery(mc);
                    case MARGIN_QUERY -> new MarginQuery();
                    case PRINT_LIST -> new PrintList();
                    case PLAN_CHANGES -> new PlanChanges();
                    case CANCEL_NETWORK -> new CancelNetwork();
                    default -> {
                        new Exit();
                        break loop;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                new Exit();
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
