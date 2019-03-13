package homework_day02;
/*
某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
​存期	年利率（%）:一年	2.25;两年	2.7;三年	3.25;五年	3.6.
​请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
 */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入您要存入的金额(1000起存):");
        int money=sc.nextInt();
        System.out.println("请输入存钱的年限:)");
        int year=sc.nextInt();
        double sum=0;

        if (money>=1000) {
            if (year == 1) {
                sum = money * (1 + 0.0225);
                System.out.println("一年到期后得到的本息总额：" + sum);
            } else if (year == 2) {
                    sum = money * (1 + 0.027)*2;
                    System.out.println("两年到期后得到的本息总额：" + sum);
                } else if (year == 3) {
                    sum = money * (1 + 0.0325)*3;
                    System.out.println("三年到期后得到的本息总额：" + sum);
                }else if (year == 4) {
                    sum = money * (1 + 0.036)*5;
                    System.out.println("五年到期后得到的本息总额：" + sum);
                }

            }else {
                System.out.println("您输入的金额或者年限有误！");
        }

    }
}
