package com.yyz.yunsuan;

public class Test1 {
    public static void main(String[] args) {

        int a=100;
        int b=200;
        int c=300;

        System.out.println(a==b&&a>b);//false&&false
        System.out.println(a<=b&&a>b);//true&&false
        System.out.println(a<=b&&c>b);//true&&true

        System.out.println(a==b||a>b);//false||false
        System.out.println(a<=b||a>b);//true||false
        System.out.println(a<=b||c>b);//true||true

        System.out.println("***************");
        int weight1=180,weight2=200;
        boolean boo= (weight1==weight2) ? true:false;
        System.out.println("boo:"+boo);

        for (int i = 0; i < 6; i++) {
            if (i == 1) {
                System.out.print("*");
            }

            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
