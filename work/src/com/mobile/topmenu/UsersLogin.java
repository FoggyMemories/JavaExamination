package com.mobile.topmenu;

import com.mobile.data.CustomerInfo;
import com.mobile.mobilemenu.WEIMenu;
import com.mobile.util.CardUtil;

import java.util.HashMap;
import java.util.Scanner;

import static com.mobile.util.JudgeUtil.judgePhoneNumber;


//用户登录
public class UsersLogin {
    public UsersLogin() {
        Scanner sc = new Scanner(System.in);


        loop:
        while (true) {
            CustomerInfo c = new CustomerInfo();
            System.out.print("请输入卡号:");
            try {
                String cardNumber = sc.nextLine();
                c.setCardNumber(cardNumber);
                Long.parseLong(c.getCardNumber());

                //对比正则,查看输入的卡号是否合法
                boolean b = judgePhoneNumber(c.getCardNumber());

                //引入总库,对比卡号是否存在
                CardUtil cardUtil = new CardUtil();
                HashMap<String, CustomerInfo> cards = cardUtil.getHashMap();

                //判断输入的卡号在库中是否存在
                boolean b1 = cards.containsKey(cardNumber);


                //从keys中获取对应的value
                CustomerInfo ci = cards.get(cardNumber);

                if (!b || !b1) {
                    System.out.println("*该卡号信息不存在(输入任意字符继续,如需退出登陆,请输入:exit)*");
                    System.out.print(":");
                    String str = sc.nextLine();
                    if (str.equalsIgnoreCase("exit")) {
                        new WelcomeScreen();
                        break;
                    }
                } else {
                    System.out.print("卡号正确,");

                    //重置计数器
                    int count = 0;

                    while (true) {
                        //对输入的次数进行限定
                        if (count >= 3) {
                            System.out.println("***输入密码错误次数超过三次,账户被锁定.***");
                            new Exit();
                            break loop;
                        }
                        //提示用户输入密码
                        System.out.print("请输入密码:");
                        String passWord = sc.nextLine();

                        //再从对应的value中获取密码
                        String passWord1 = ci.getPassWord();
                        if (matePassWord(passWord, passWord1)) {
                            System.out.println("您输入的密码正确,登陆成功");
                            new WEIMenu(ci);
                            break loop;
                        } else {
                            System.out.println("*您输入的密码有误,请重新输入密码*");
                            count++;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("*输入的为非数字,请重新输入*");
            }
        }


    }

    //判断密码是否正确
    public static boolean matePassWord(String passWord, String passWord1) {
        return passWord.equals(passWord1);
    }
}
