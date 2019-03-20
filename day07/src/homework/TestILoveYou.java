package homework;

import java.util.Arrays;

/**
 * 定义一个字符数组{'我','爱','你'}然后再分别正着和反着输出
 */
public class TestILoveYou {
    public static void main(String[] args) {
        char[] ch= {'我','爱','你'};
        System.out.println(Arrays.toString(ch));
        char temp = ch[0];
        ch[0] = ch[2];
        ch[2] = temp;
        System.out.println(Arrays.toString(ch));
    }
}
