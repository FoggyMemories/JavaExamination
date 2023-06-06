package com.mobile.util;

import com.mobile.data.CustomerInfo;
import com.mobile.mobilemenu.WEIMenu;
import com.mobile.topmenu.Exit;
import com.mobile.topmenu.WelcomeScreen;

import java.util.Scanner;

//返回上一级工具

public class ReturnUtil {
    public ReturnUtil(CustomerInfo ci) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("返回用户菜单请按 (1) , 返回业务大厅请按 (2) , 点击其他按键退出程序");
        Scanner sc = new Scanner(System.in);

        int num;
        while (true) {
            System.out.print("请输入:");
            String strNum = sc.nextLine();
            try {
                num = Integer.parseInt(strNum);
                break;
            } catch (NumberFormatException e) {
                System.out.println("*输入不合法*");
            }
        }

        switch (num) {
            case 1 -> new WEIMenu(ci);
            case 2 -> new WelcomeScreen();
            default -> new Exit();
        }
    }
}
