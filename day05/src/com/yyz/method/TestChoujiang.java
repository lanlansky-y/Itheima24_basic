package com.yyz.method;

import java.util.Random;

/*
一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果
如下：（随机顺序，不一定是下面的顺序）
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
 */
public class TestChoujiang {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] brr = new int[arr.length];
        int index = 0;

        while(index < brr.length){
            Random random = new Random();
            int a = random.nextInt(arr.length);
            boolean b = exist(brr, arr[a]);
            if(!b){
                brr[index] = arr[a];
                index++;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i] + "元的奖金被抽出");
        }

    }
    public static boolean exist(int[] arr, int a){

        for (int i = 0; i < arr.length; i++) {

            if(a == arr[i]){
                return true;
            }
        }
        return false;
    }
}
