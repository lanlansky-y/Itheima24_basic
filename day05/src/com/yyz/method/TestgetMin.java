package com.yyz.method;
/*
定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
 */
public class TestgetMin {
    public static void main(String[] args) {
        getMin(5.0,4.6);
    }

    public static void getMin(double num1, double num2){
        double min = num1;
        if(min > num2){
            min = num2;
        }

        System.out.println(min);
    }
}
