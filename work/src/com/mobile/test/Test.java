package com.mobile.test;


import java.util.ArrayList;
import java.util.Collections;

//进行对代码片段测试
public class Test {
    public static void main(String[] args) {


        ArrayList<String> typeList = new ArrayList<>();
        Collections.addAll(typeList, "话唠套餐", "网虫套餐", "超人套餐");

        System.out.println("***********************可选套餐***********************");

        for (int i = 0; i < typeList.size(); i++) {
            if (i % 3 == 2) {
                System.out.println("\t\t" + (i + 1) + "." + typeList.get(i));
            } else {
                System.out.print("\t\t" + (i + 1) + "." + typeList.get(i));
            }
        }
    }
}
