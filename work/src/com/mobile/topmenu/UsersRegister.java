package com.mobile.topmenu;


import com.mobile.data.CustomerInfo;
import com.mobile.errors.NoneFoundNumberException;
import com.mobile.util.UsersInputUtil;

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

        //创建新的用户Util输入判断
        UsersInputUtil uiu = new UsersInputUtil();
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
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的格式不合法,请重新输入.");
            } catch (NoneFoundNumberException e) {
                System.out.println("请输入 1 ~ 9 之间的整数");
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

        //进行用户输入
        //提示用户选择套餐类型
        System.out.println("请选择套餐序号:");
        String strNum = sc.nextLine();

        try {
            int num = Integer.parseInt(strNum);
            uiu.setChooseTypeNum(num);
        } catch (NumberFormatException e) {
            System.out.println("输入的格式不合法,请重新输入.");
        } catch (NoneFoundNumberException e) {
            System.out.println("请输入 1 ~ 3 之间的整数");
        }


        //创建新的用户对象接收新建用户
        CustomerInfo c = new CustomerInfo();

        //提示用户输入姓名
        String name = sc.nextLine();


    }
}
