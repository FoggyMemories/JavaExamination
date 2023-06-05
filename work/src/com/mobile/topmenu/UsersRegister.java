package com.mobile.topmenu;


import com.mobile.data.CustomerInfo;
import com.mobile.errors.NoneFoundNumberException;
import com.mobile.mobileshop.AllServicePackage;
import com.mobile.mobileshop.NetPackage;
import com.mobile.mobileshop.SuperPackage;
import com.mobile.mobileshop.TalkPackage;
import com.mobile.util.ReturnUtil;
import com.mobile.util.UsersInputUtil;
import com.mobile.util.JudgeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//用户注册
public class UsersRegister {
    public UsersRegister() {

        System.out.println("用户注册");
        System.out.println("***********************可选号码***********************");

        //新建列表，将可选卡号装填
        ArrayList<String> cardNumList = new ArrayList<>();
        Collections.addAll(cardNumList, "13989738500", "13958616378", "13977874836",
                "13989035778", "13963473094", "13974344372",
                "13936132587", "13987176519", "13917727166");

        //新建列表,将可选套餐装填
        ArrayList<String> typeList = new ArrayList<>();
        Collections.addAll(typeList, "话唠套餐", "网虫套餐", "超人套餐");


        //对可选卡号进行打印
        for (int i = 0; i < cardNumList.size(); i++) {
            if (i % 3 == 2) {
                System.out.println("\t" + (i + 1) + "." + cardNumList.get(i));
            } else {
                System.out.print("\t" + (i + 1) + "." + cardNumList.get(i));
            }
        }

        System.out.println("*****************************************************");

        //创建新的用户Util输入判断
        UsersInputUtil uiu = new UsersInputUtil();

        //创建新的用户对象接收新建用户
        CustomerInfo ci = new CustomerInfo();

        //进行用户输入
        Scanner sc = new Scanner(System.in);

        while (true) {
            //提示用户进行输入
            System.out.print("请选择卡号(输入1 ~ 9)的序号:");
            //将用户输入的字符转化为合法的数字
            String strNum = sc.nextLine();
            try {
                int num = Integer.parseInt(strNum);
                uiu.setChooseCardNum(num);
                //将用户选择的号码存储在新建用户之中
                ci.setCardNumber(cardNumList.get(num - 1));
                break;
            } catch (NumberFormatException e) {
                System.out.println("*输入的格式不合法,请重新输入.*");
            } catch (NoneFoundNumberException e) {
                System.out.println("*请输入 1 ~ 9 之间的整数.*");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("*输入的选项不存在,请重新输入.*");
            }
        }

        //对可选套餐类型进行打印
        System.out.println("***********************可选套餐***********************");

        for (int i = 0; i < typeList.size(); i++) {
            if (i % 3 == 2) {
                System.out.println("\t" + (i + 1) + "." + typeList.get(i));
            } else {
                System.out.print("\t" + (i + 1) + "." + typeList.get(i));
            }
        }

        System.out.println("*****************************************************");

        //进行用户输入
        //提示用户选择套餐类型
        while (true) {
            System.out.print("请选择套餐序号:");
            String strNum = sc.nextLine();

            try {
                int num = Integer.parseInt(strNum);
                uiu.setChooseTypeNum(num);

                //将纯数字转化为对应的套餐
                ci.setSerPackage(turn(uiu.getChooseTypeNum()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("*输入的格式不合法,请重新输入套餐序号.*");
            } catch (NoneFoundNumberException e) {
                System.out.println("*请输入 1 ~ 3 之间的整数.*");
            }
        }


        //名字长度应当在2 ~ 5之间
        while (true) {
            //提示用户输入姓名
            System.out.print("请输入姓名:");
            String name = sc.nextLine();
            //名字长度越界捕获
            try {
                ci.setUserName(name);
                break;
            } catch (Exception e) {
                System.out.println("*您输入的用户名长度应当在2 ~ 10之间,请重新输入用户名.*");
            }
        }

        //提示用户输入密码
        while (true) {
            System.out.print("请输入密码:");
            String passWord = sc.nextLine();

            //对密码规则进行判断
            if (JudgeUtil.judgePassWord(passWord)) {
                //应当进行密码重新输入对比
                System.out.print("请重新输入密码:");
                String rePassWord = sc.nextLine();
                if (passWord.equals(rePassWord)) {
                    ci.setPassWord(passWord);
                    break;
                } else {
                    System.out.println("*输入的两次密码不同,请重新输入密码.*");
                }
            } else {
                System.out.println("*密码长度8-16位、至少包含数字、一个小写字母、一个大写字母.*");
            }
        }

        int count;
        //提示用户预存话费
        while (true) {
            System.out.print("请输入预存话费金额:");
            loop:
            try {
                String strNum1 = sc.nextLine();
                count = Integer.parseInt(strNum1);
                if (count < 0) {
                    throw new NoneFoundNumberException();
                }
                if (count < 50) {
                    System.out.println("*预存的最小金额为 50 .*");
                    break loop;
                }
                break;
            } catch (NumberFormatException | NoneFoundNumberException e) {
                System.out.println("*输入的格式不合法,请重新输入.*");
            }
        }

        //提示注册成功
        System.out.println("**************************注册成功**************************");
        //重置余额
        double remainCustomerAmount = ci.getCustomerAmount() + count - ci.getSerPackage().getPrice();
        ci.setCustomerAmount(remainCustomerAmount);
        System.out.println("卡号:" + ci.getCardNumber() + " 用户名:" +
                ci.getUserName() + " 当前余额:" + (remainCustomerAmount));
        System.out.println(ci.getSerPackage().toString());

        new ReturnUtil(ci);

        //释放资源
        sc.close();
    }

    //将套餐数字转化为具体的套餐种类
    public static AllServicePackage turn(int num) {
        switch (num) {
            case 1 -> {
                return new TalkPackage();
            }
            case 2 -> {
                return new NetPackage();
            }
            case 3 -> {
                return new SuperPackage();
            }
            default -> throw new NoneFoundNumberException();
        }
    }
}
