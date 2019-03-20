package com.yyz.method;

import java.util.Scanner;

/*
在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，
在方法中从大到小依次打印三个变量。执行效果如下：
 */
public class TestSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三个整数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        printSort(a, b, c);
        printSort1(a, b, c);
    }

    public static void printSort(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + "\t");
            if (num2 >= num3) {
                System.out.print(num2 + "\t" + num3);
            } else {
                System.out.print(num3 + "\t" + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2 + "\t");
            if (num1 >= num3) {
                System.out.print(num1 + "\t" + num3);
            } else {
                System.out.print(num3 + "\t" + num1);
            }
        } else {
            System.out.print(num3 + "\t");
            if (num1 >= num2) {
                System.out.print(num1 + "\t" + num2);
            } else {
                System.out.print(num2 + "\t" + num1);
            }
        }
    }

    public static void printSort1(int num1, int num2, int num3){
        int max,  min;
        if(num1 >= num2 && num1 >= num3){
            max = num1;
            if(num2 >= num3){
                min =num3;
            }else{
                min = num2;
            }
        }else if(num2 >= num1 && num2 >= num3){
            max = num2;
            if(num1 >= num3){
                min = num3;
            }else {
                min =num1;
            }
        }else{
            max =num3;
            if(num1 >= num2){
                min = num2;
            }else {
                min =num1;
            }
        }
        int mid = num1 + num2 + num3 - max - min;
        System.out.println(max + "\t" + mid + "\t" + min);
    }
}
