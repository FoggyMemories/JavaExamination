package com.mobile.test;

//进行对代码片段测试


import java.util.Collections;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, "数字", "数字学院", "数据科学技术");
        for (String s : set) {
            System.out.println(s);
        }
    }
}






