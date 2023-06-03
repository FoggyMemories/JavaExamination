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

        System.out.print("请输入密码:");
        String passWord = sc.nextLine();
        if(matePassWord(passWord)){
            System.out.println("您输入的密码正确");
        } else {
            System.out.println("您输入的密码有误");
        }

    }

    //使用正则表达式判断输入的手机卡号是否合法
    public static boolean judgePhoneNumber(String phoneNumber) {
        //根据工信部2019年最新公布手机号段
        String regex = "^(?:(?:\\+|00)86)?1(?:(?:3[\\d])|(?:4[5-7|9])|(?:5[0-3|5-9])|(?:6[5-7])|(?:7[0-8])|(?:8[\\d])|(?:9[1|8|9]))\\d{8}$";
        return phoneNumber.matches(regex);
    }

    //判断密码是否合法
    public static boolean judgePassWord(String passWord) {

        //万能密码
        String regexAll = "123";

        //密码长度8-16位、至少包含数字、一个小写字母、一个大写字母、一个特殊符号
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";

        if(!passWord.matches(regex) || !passWord.matches(regexAll)){
            System.out.println("您输入的密码格式有误(密码长度8-16位、至少包含数字、一个小写字母、一个大写字母、一个特殊符号)");
            return false;
        }

        return true;
    }

    //判断密码是否正确
    public static boolean matePassWord(String passWord) {
        judgePassWord(passWord);
        String passWordTemp = "123";
        return judgePassWord(passWordTemp) || passWord.equals(passWordTemp);
    }
}
