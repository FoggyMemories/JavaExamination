package com.mobile.topmenu;

import com.mobile.data.CustomerInfo;
import com.mobile.mobilemenu.UesWEI;

import java.util.Scanner;

import static com.mobile.util.judgeUtil.judgePhoneNumber;


//用户登录
public class UsersLogin {
    public UsersLogin() {
        Scanner sc = new Scanner(System.in);


        while (true) {
            CustomerInfo c = new CustomerInfo();
            System.out.print("请输入手机卡号:");
            loop:
            try {
                String phoneNumber = sc.nextLine();
                c.setCardNumber(phoneNumber);
                Long.parseLong(c.getCardNumber());
                if (!judgePhoneNumber(c.getCardNumber())) {
                    System.out.println("手机号不合法,请重新输入手机号");
                    break loop;
                }
                System.out.println("手机号合法");
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }


        //密码部分暂时挂起
        System.out.print("请输入密码:");
        String passWord = sc.nextLine();
        if (matePassWord(passWord)) {
            System.out.println("您输入的密码正确");
            new UesWEI();
        } else {
            System.out.println("您输入的密码有误");
        }

    }


    //判断密码是否合法
    public static boolean judgePassWord(String passWord) {

        //密码判断暂时挂起

        /*//万能密码
        String regexAll = "123";

        //密码长度8-16位、至少包含数字、一个小写字母、一个大写字母、一个特殊符号
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";

        if(!passWord.matches(regex) || !passWord.matches(regexAll)){
            System.out.println("您输入的密码格式有误(密码长度8-16位、至少包含数字、一个小写字母、一个大写字母、一个特殊符号)");
            return false;
        }
        */

        return true;
    }

    //判断密码是否正确
    public static boolean matePassWord(String passWord) {

        /*judgePassWord(passWord);
        String passWordTemp = "123";
        boolean b = judgePassWord(passWordTemp) || passWord.equals(passWordTemp);*/

        return true;
    }
}
