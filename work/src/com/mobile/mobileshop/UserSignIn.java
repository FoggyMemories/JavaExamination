package com.mobile.mobileshop;

import java.util.Scanner;

public class UserSignIn {
    public UserSignIn() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("请输入手机卡号:");
            try {
                String phoneNumber = sc.nextLine();
                Long.parseLong(phoneNumber);
                if (!judgePhoneNumber(phoneNumber)) {
                    System.out.println("手机号不合法");
                    break;
                }
                System.out.println("手机号合法");
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    //使用正则表达式判断输入的手机卡号是否合法
    public static boolean judgePhoneNumber(String phoneNumber) {
        //根据工信部2019年最新公布手机号段
        String regex = "^(?:(?:\\+|00)86)?1(?:(?:3[\\d])|(?:4[5-7|9])|(?:5[0-3|5-9])|(?:6[5-7])|(?:7[0-8])|(?:8[\\d])|(?:9[1|8|9]))\\d{8}$";
        return phoneNumber.matches(regex);
    }
}
