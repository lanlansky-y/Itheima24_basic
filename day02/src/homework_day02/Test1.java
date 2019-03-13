package homework_day02;

import java.util.Scanner;

/*
让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        int min=num1;
        if (min > num2) {
            min=num2;
        }
        if(min > num3){
            min=num3;
        }
        System.out.println("最小值为"+min);
    }
}
