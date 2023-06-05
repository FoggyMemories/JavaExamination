package com.mobile.topmenu;

import com.mobile.errors.NoneFoundNumberException;
import com.mobile.util.UsersInputUtil;

import java.util.Scanner;


//欢迎界面

public class WelcomeScreen {

    private static final int LOGIN = 1;
    private static final int REGISTER = 2;
    private static final int USE_WEI = 3;
    private static final int RECHARGE = 4;
    private static final int DESCRIPTION = 5;
    private static final int EXIT = 6;

    public static void print() {
        //欢迎界面字符
        System.out.println("************************欢迎使用WEI移动业务大厅************************");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1.用户登录\t2.用户注册\t3.使用WEI\t4.话费充值\t5.资费说明\t6.退出系统");
        System.out.println("------------------------------------------------------------------------");
        //提示用户输入
        System.out.print("请选择:");
    }

    public WelcomeScreen() {
        Scanner sc = new Scanner(System.in);
        UsersInputUtil u = new UsersInputUtil();
        loop:
        while (true) {
            print();
            try {
                String strNum = sc.nextLine();
                int num = Integer.parseInt(strNum);
                u.setWelcomeNum(num);
                switch (u.getWelcomeNum()) {
                    case LOGIN -> new UsersLogin();
                    case REGISTER -> new UsersRegister();
                    case USE_WEI -> new UseWEI();
                    case RECHARGE -> new TariffRecharge();
                    case DESCRIPTION -> new TariffDescription();
                    case EXIT -> {
                        new Exit();
                        break loop;
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("*输入的格式不合法,请重新输入.*");
            } catch (NoneFoundNumberException e) {
                System.out.println("*请输入 1 ~ 6 之间的整数.*");
            }
        }

        //释放资源
        sc.close();
    }
}
