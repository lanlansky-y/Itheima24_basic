package com.yyz.yunsuan;

import java.util.Scanner;

public class ScannerDaxiaoxie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        int i=(int)(str.charAt(0));

        if (i>=97&&i<=123){
            System.out.println("你输入的是小写字母！");
        }else if (i>=65&&i<=96){
            System.out.println("你输入的是大写字母！");
        }else if (i>=48&&i<=58){
            System.out.println("你输入的是数字！");
        }else{
            System.out.println("你输入有误！");
        }

    }
}
