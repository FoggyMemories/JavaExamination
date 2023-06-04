package com.mobile.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//进行对代码片段测试
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入预存话费金额:");
            loop:
            try {
                String strNum1 = sc.nextLine();
                int count = Integer.parseInt(strNum1);
                if (count < 50) {
                    System.out.println("预存的最小金额为50,请重新输入");
                    break loop;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的格式不合法,请重新输入.");
            }
        }
    }
}
