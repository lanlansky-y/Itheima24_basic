package com.yyz.yunsuan;

import java.util.Scanner;

public class TestSwitchChuantou {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i){
            case 1:
            case 2:
            case 3:
                System.out.println("啦啦啦");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("hehehe");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("heiheihei");
                break;
            default:
                System.out.println("nananana");
                break;
        }
    }
}
