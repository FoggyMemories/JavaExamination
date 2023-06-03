package com.mobile.topmenu;

import com.mobile.data.CustomerInfo;
import com.mobile.mobilemenu.UesWEI;
import com.mobile.mobileshop.MobileCard;
import com.mobile.util.CardUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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

                //对比正则,查看输入的手机号是否合法
                boolean b = !judgePhoneNumber(c.getCardNumber());

                //引入总库,对比手机号是否存在
                CardUtil cardUtil = new CardUtil();
                HashMap<String, MobileCard> cards = cardUtil.getHashMap();
                Set<String> keys = cards.keySet();
                Collection<MobileCard> values = cards.values();

                for (String s : keys) {
                    boolean b1 = c.getCardNumber().equals(s);
                    if (b || b1) {
                        System.out.println("手机号不存在,请重新输入手机号");
                        break loop;
                    }
                }
                System.out.println("手机号合法");
                //密码部分暂时挂起
                System.out.print("请输入密码:");
                String passWord = sc.nextLine();

                for (MobileCard value : values) {
                    String passWord1 = value.getPassWord();
                    if (matePassWord(passWord, passWord1)) {
                        System.out.println("您输入的密码正确");
                        new UesWEI();
                    } else {
                        System.out.println("您输入的密码有误");
                    }
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的为非数字,请重新输入");
            }
        }


    }


    public static boolean judgePassWord(String passWord) {

        //万能密码
        String regexAll = "123";

        //密码长度8-16位、至少包含数字、一个小写字母、一个大写字母、一个特殊符号
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";

        if (!passWord.matches(regex) && !passWord.matches(regexAll)) {
            System.out.println("您输入的密码格式有误(密码长度8-16位、至少包含数字、一个小写字母、一个大写字母、一个特殊符号)");
            return false;
        }

        return true;
    }

    //判断密码是否正确
    public static boolean matePassWord(String passWord, String passWord1) {

        boolean b = judgePassWord(passWord);
        boolean b1 = passWord.equals(passWord1);

        return b & b1;
    }
}
