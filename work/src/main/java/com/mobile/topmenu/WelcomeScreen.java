package com.mobile.topmenu;

import com.mobile.errors.NoneFoundNumberException;

import java.util.Scanner;
import java.io.IOException;


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

        try {
            // 执行系统命令来清屏
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        loop:
        while (true) {
            print();
            try {
                String strNum = sc.nextLine();
                int num = Integer.parseInt(strNum);
                if (num < 1 || num > 6) {
                    throw new NoneFoundNumberException();
                }
                switch (num) {
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
