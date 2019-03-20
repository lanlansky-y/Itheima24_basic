package com.yyz.array;
/*
打印扑克  把54张扑克组成一个数组（扑克有花色和数字组成
如 红桃K，黑桃A，方片6） 遍历所有的扑克
 */
public class TestArrayPoker {
    public static void main(String[] args) {
        String[] str1 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] str2 = {"黑桃", "红桃", "梅花", "方块"};
        String[] str3 = new String[54];

        for (int i = 0; i < str2.length; i++) {
            int k = 0;
            for (int j = 0; j < str1.length; j++) {
//                System.out.print(str2[i] + str1[j] + " ");
                str3[k+i] = str2[i] + str1[j];

//                System.out.print(str3[k+i] + " ");
                k += 4;
            }
//            System.out.println();
        }
        str3[52] = "小王";
        str3[53] = "大王";
        for (int i = 0; i < str3.length; i++) {
            if(i % 13 == 0){
                System.out.println();
            }
            System.out.print(str3[i] + "\t");
        }

    }
}
