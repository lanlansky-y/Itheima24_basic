package com.yyz.yunsuan;

public class Test2 {
    public static void main(String[] args) {

        for (int i = 1; i <10; i++) {
            for (int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }

    }
}