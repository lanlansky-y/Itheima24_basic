package homeWork;

import java.util.Scanner;

/**
 * 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别
 * 有多少个。比如：Hello12345World中字母：10个，数字：5个。
 */
public class TestStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();
        staWordNum(str);
    }

    public static void staWordNum(String str) {
        int word = 0;
        int num = 0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch <='9'){
                num++;
            }
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                word++;
            }
        }
        System.out.println(str+"中字母："+word+"，数字："+num);
    }
}
