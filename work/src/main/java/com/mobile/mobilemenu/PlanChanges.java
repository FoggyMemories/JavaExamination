package com.mobile.mobilemenu;

import com.mobile.data.CustomerInfo;
import com.mobile.errors.NoneFoundNumberException;
import com.mobile.entity.NetPackage;
import com.mobile.entity.SuperPackage;
import com.mobile.entity.TalkPackage;
import com.mobile.util.ReturnUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static com.mobile.util.TurnToUtil.turn;

//套餐变更

public class PlanChanges {
    public PlanChanges(CustomerInfo ci) {

        Scanner sc = new Scanner(System.in);

        //新建列表,将可选套餐装填
        ArrayList<String> typeList = new ArrayList<>();
        Collections.addAll(typeList, "话唠套餐", "网虫套餐", "超人套餐");

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
        int num;
        while (true) {
            System.out.print("请选择套餐序号:");
            String strNum = sc.nextLine();

            try {
                num = Integer.parseInt(strNum);
                if(num < 0 || num > 3){
                    throw new NoneFoundNumberException();
                }

                //将纯数字转化为对应的套餐
                ci.setSerPackage(turn(num));
                break;
            } catch (NumberFormatException e) {
                System.out.println("*输入的格式不合法,请重新输入套餐序号.*");
            } catch (NoneFoundNumberException e) {
                System.out.println("*请输入 1 ~ 3 之间的整数.*");
            }
        }

        System.out.println("套餐变更成功");
        System.out.println("变更后套餐资费详情:");
        switch (num) {
            case 1 -> System.out.println("套餐类型:" + "话痨套餐\n" + new TalkPackage());

            case 2 -> System.out.println("套餐类型:" + "网虫套餐\n" + new NetPackage());

            case 3 -> System.out.println("套餐类型:" + "超人套餐\n" + new SuperPackage());


        }

        //提示用户返回上一级
        new ReturnUtil(ci);
    }
}
