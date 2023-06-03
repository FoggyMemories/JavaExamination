package com.mobile.mobileshop;

import com.mobile.service.Users;

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

    public UesWEI() {
        Scanner sc = new Scanner(System.in);
        Users u = new Users();

        print();
        System.out.println("请选择,其他键返回上一级");
        String strNum = sc.nextLine();
        int num = Integer.parseInt(strNum);
        u.setWEIMenuNum(num);

        switch (u.getWEIMenuNum()) {
            case BILLING_QUERY -> System.out.println("1.本月账单查询");
            case MARGIN_QUERY -> System.out.println("2.套餐余量查询");
            case PRINT_LIST -> System.out.println("3.打印消费详单");
            case PLAN_CHANGES -> System.out.println("4.套餐变更");
            case CANCEL_NETWORK -> System.out.println("5.办理退网");
            default -> exit();
        }
    }

    public static void print() {
        System.out.println("1.本月账单查询");
        System.out.println("2.套餐余量查询");
        System.out.println("3.打印消费详单");
        System.out.println("4.套餐变更");
        System.out.println("5.办理退网");
    }

    public static void exit() {

    }
}
