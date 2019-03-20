package com.yyz.method;
/*
请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
 */
public class TestSishewuru {
    public static void main(String[] args) {
        int a = siShewuru(4.00);
        System.out.println(a);
    }

    public static int siShewuru(double num){
        int a = (int)(num*10 % 10);
        if(a >= 5){
            a = (int)num + 1;
        }else {
            a = (int)num;
        }
        return a;
    }
}
