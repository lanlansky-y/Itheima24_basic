package com.yyz.array;
/*
洗牌
 */
public class TestXipai {
    public static void main(String[] args) {
        String[] str1 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] str2 = {"黑桃", "红桃", "梅花", "方块"};
        for (int i = 0; i < str1.length; i++) {
            int num = (int)(Math.random() * 13);
            String temp = str1[i];
            str1[i] = str1[num];
            str1[num] = temp;
        }
    }
}
