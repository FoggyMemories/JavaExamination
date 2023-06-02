package com.mobile.service;

import com.mobile.errors.NoneFoundNumberException;
import com.mobile.mobileshop.UserSignIn;

import java.util.Scanner;

public class WelcomeScreen {
    private static final int LOGIN = 1;
    private static final int REGISTER = 2;
    private static final int USEWEI = 3;
    private static final int RECHARGE = 4;
    private static final int DESCRIPTION = 5;
    private static final int EXIT = 6;

    static {
        //欢迎界面字符
        System.out.println("**********************欢迎使用WEI移动业务大厅**********************");
        System.out.println("1.用户登录\t2.用户注册\t3.使用WEI\t4.话费充值\t5.资费说明\t6.退出系统");
        search();
    }

    public static void search() {
        Scanner sc = new Scanner(System.in);
        Users u = new Users();
        loop:
        while (true) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1.用户登录\t2.用户注册\t3.使用WEI\t4.话费充值\t5.资费说明\t6.退出系统");
            //提示用户输入
            System.out.print("请选择:");
            try {
                String strNum = sc.nextLine();
                int num = Integer.parseInt(strNum);
                u.setNum(num);
                switch (u.getNum()) {
                    case LOGIN -> new UserSignIn();
                    case REGISTER -> System.out.println("用户注册");
                    case USEWEI -> System.out.println("使用WEI");
                    case RECHARGE -> System.out.println("话费充值");
                    case DESCRIPTION -> System.out.println("资费说明");
                    case EXIT -> {
                        System.out.println("谢谢使用,再见.");
                        break loop;
                    }
                }
                break;
            } catch (NumberFormatException | NoneFoundNumberException e) {
                e.printStackTrace();
            }
        }

        //释放资源
        sc.close();
    }
}
