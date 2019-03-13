package com.yyz.yunsuan;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        System.out.print("请输入甲的身高：");
        Scanner sc=new Scanner(System.in);
        int height1=sc.nextInt();//nextInt()可以换行

        System.out.print("请输入乙的身高：");
        int height2=sc.nextInt();

        System.out.print("请输入丙的身高：");
        int height3=sc.nextInt();

        int tempHeight=height1>height2? height1:height2;

        int maxHeight=tempHeight>height3? tempHeight:height3;

        System.out.println("甲乙丙三人中最高的身高是"+maxHeight+"cm");
    }
}
