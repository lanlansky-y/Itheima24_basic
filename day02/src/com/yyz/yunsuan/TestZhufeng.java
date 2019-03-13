package com.yyz.yunsuan;

public class TestZhufeng {
    public static void main(String[] args) {
//        int zf=8844430,count=0;
//        double paper=0.1;
//        while(paper<=zf){
//            paper=paper*2;
//            count++;
//        }
//        System.out.println("需要折"+count+"次");

        int zf=8844430,count=0;
        for (double paper = 0.1; paper <=zf ; ) {
            paper=paper*2;
            count++;
        }
        System.out.println("需要折"+count+"次");
    }
}
