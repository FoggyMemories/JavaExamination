package com.mobile.service;

import com.mobile.errors.NoneFoundNumberException;
import com.mobile.mobileshop.UserSignIn;

import java.util.Scanner;

public class WelcomeScreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //欢迎界面字符
        System.out.println("**********************欢迎使用WEI移动业务大厅**********************");

        while (true) {
            System.out.println("1.用户登录\t2.用户注册\t3.使用WEI\t4.话费充值\t5.资费说明\t6.退出系统");
            //提示用户输入
            System.out.print("请选择:");
            try {
                String strNum = sc.nextLine();
                int num = Integer.parseInt(strNum);
                if(num < 1 || num > 6){
                    throw new NoneFoundNumberException("请输入 1 ~ 6 之间的整数");
                }
                switch (num){
                    case 1 -> new UserSignIn();
                    case 2 -> System.out.println("用户注册");
                    case 3 -> System.out.println("使用WEI");
                    case 4 -> System.out.println("话费充值");
                    case 5 -> System.out.println("资费说明");
                    case 6 -> System.out.println("退出系统");
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("输入的数字非法");
            }
        }


        //释放资源
        sc.close();
    }
}
