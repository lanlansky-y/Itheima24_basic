package com.yyz.yunsuan;

public class TestShuixianhua {
    public static void main(String[] args) {
        int ge,shi,bai;
        for (int i = 100; i <1000 ; i++) {
            ge=i%10;
            shi=i/10%10;
            bai=i/100;

            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(i+"是水仙花数");

            }

        }
    }
}
