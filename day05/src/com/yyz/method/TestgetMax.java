package com.yyz.method;
/*
定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
 */
public class TestgetMax {
    public static void main(String[] args) {
        int max = getMax(5,10,80);
        System.out.println(max);


    }
    public static int getMax(int num1, int num2, int num3){
        int max = num1;
        if(max < num2){
            max = num2;
            if(max < num3){
                max = num3;
            }

        }else {
            if(max < num3){
                max = num3;
            }
        }
        return max;
    }

}
