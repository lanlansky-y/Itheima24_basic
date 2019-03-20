package com.yyz.method;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/*
通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，
方法的功能是打印n行m列的@符号。执行效果如下：
 */
public class Testprint {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        int n, m;
        Scanner sc =new Scanner(System.in);
        System.out.print("请输入行数：");
        n = sc.nextInt();
        System.out.print("请输入列数：");
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("@" + " ");
            }
            System.out.println();
        }
    }
}
